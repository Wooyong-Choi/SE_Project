package ocsf;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

import db.LectureDBAccessor;
import db.StudentDBAccessor;
import info.Lecture;
import info.Student;

public class AcceptThread extends SocketCommunication implements Runnable {

	private LectureDBAccessor lecDB;
	private StudentDBAccessor stdDB;

	public AcceptThread(Socket sock) {
		this.sock = sock;

		stdDB = new StudentDBAccessor();
		lecDB = new LectureDBAccessor();
	}

	@Override
	public void run() {
		Packet pkt;
		while(true) {
			pkt = readFromSocket();
			System.out.println("패킷 읽음");

			switch(pkt.getRequest()) {
			case 0:  // 0 : Read Student
				System.out.println("Request 0");
				Student usr = pkt.getStd();

				usr = findUser(usr);
				if (usr != null)  // 로그인 성공
					pkt = new Packet(usr, 0);
				else  // 로그인 실패
					pkt = new Packet(-1);

				writeToSocket(pkt);
				break;

			case 1:  // 1 : Write Student
				System.out.println("Request 1");
				Student usr1 = pkt.getStd();
				stdDB.writeFile(updateUser(usr1));
				break;

			case 2:  // 2 : Read Lecture List
				System.out.println("Request 2");
				pkt = new Packet(lecDB.readFile());
				writeToSocket(pkt);
				break;

			case 3:  // 3 : Peep other's timetable
				System.out.println("Request 3");
				Student usr2 = pkt.getStd();
				pkt = new Packet(findTimetable(usr2));
				writeToSocket(pkt);
				break;
			}
		}
	}

	private Student findUser(Student usr) {
		for (Student std : stdDB.readFile()) {
			if (std.getID().equals(usr.getID()) && std.getPassword().equals(usr.getPassword())) {
				// 로그인 성공
				return std;
			}
		}
		return null;
	}

	private ArrayList<Student> updateUser(Student usr) {
		ArrayList<Student> stdList = stdDB.readFile();

		for (int i = 0; i < stdList.size(); i++) {
			if (stdList.get(i).getNo().equals(usr.getNo())) {
				stdList.set(i, usr);
				return stdList;
			}
		}
		return null;
	}

	private ArrayList<Lecture> findTimetable(Student usr) {
		ArrayList<Student> stdList = stdDB.readFile();
		while(true) {
			Student std = stdList.get(Math.abs(new Random().nextInt()) % stdList.size());
			if (usr.getYear() == std.getYear()) {
				return std.getTemporaryList().getLecList();
			}
		}
	}
}