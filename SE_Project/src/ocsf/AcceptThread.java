package ocsf;

import java.net.Socket;
import java.util.ArrayList;

import db.LectureDBAccessor;
import db.StudentDBAccessor;
import info.Lecture;
import info.Student;

public class AcceptThread extends SocketCommunication implements Runnable {

	private LectureDBAccessor lecDB;
	private StudentDBAccessor stdDB;

	public AcceptThread(Socket sock) {
		this.sock = sock;

		lecDB = new LectureDBAccessor();
		stdDB = new StudentDBAccessor();
	}

	@Override
	public void run() {
		Packet pkt;
		while(true) {
			pkt = readFromSocket();

			switch(pkt.getRequest()) {
			case 0:  // 0 : Read Student
				Student usr = pkt.getStd();
				
				usr = findUser(usr);
				if (usr != null)  // 로그인 성공
					pkt = new Packet(usr, 1);
				else  // 로그인 실패
					pkt = new Packet(usr, -1);
				
				writeToSocket(pkt);
				break;

			case 1:  // 1 : Write Student
				Student usr1 = pkt.getStd();
				stdDB.writeFile(updateUser(usr1));
				break;

			case 2:  // 2 : Read Lecture List
				pkt = new Packet(lecDB.readFile());
				writeToSocket(pkt);
				break;

			case 3:  // 3 : Peep other's timetable
				Student usr2 = pkt.getStd();
				pkt = new Packet(findTimetable(usr2));
				writeToSocket(pkt);
				break;
			}
		}
	}

	private Student findUser(Student usr) {
		for (Student std : stdDB.readFile()) {
			if (std.getID().equals(usr.getID())	&& std.getPassword().equals(usr.getPassword())) {
				// 로그인 성공
				return std;

			} else {
				// 로그인 실패
				return null;
			}
		}
		return null;
	}

	private ArrayList<Student> updateUser(Student usr) {
		ArrayList<Student> stdList = stdDB.readFile();
		
		for (int i = 0; i < stdList.size(); i++) {
			if (stdList.get(i).getID().equals(usr.getID())	&& stdList.get(i).getPassword().equals(usr.getPassword())) {
				stdList.set(i, usr);
				return stdList;
			}
		}
		return null;
	}
	
	private ArrayList<Lecture> findTimetable(Student usr) {
		for (Student std : stdDB.readFile()) {
			if (usr.getYear() == std.getYear()) {
				return std.getTemporaryList().getLecList();
			}
		}
		
		return null;
	}
}