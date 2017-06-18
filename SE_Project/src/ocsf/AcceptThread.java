package ocsf;

import java.net.Socket;
import java.util.ArrayList;

import db.LectureDBAccessor;
import db.StudentDBAccessor;
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
			case 0:
				Student usr = pkt.getStd();

				for (Student std : stdDB.readFile()) {
					if (std.getID().equals(usr.getID())	&& std.getPassword().equals(usr.getPassword())) {
						// 로그인 성공
						writeToSocket(new Packet(std, 0));

					} else {
						// 로그인 실패
						writeToSocket(new Packet());
					}
				}
				break;

			case 1:
				Student usr1 = pkt.getStd();
				
				ArrayList<Student> stdList = stdDB.readFile();
				
				for (int i = 0; i < stdList.size(); i++) {
					if (stdList.get(i).getID().equals(usr1.getID())	&& stdList.get(i).getPassword().equals(usr1.getPassword())) {
						stdList.set(i, usr1);
						stdDB.writeFile(stdList);
						break;
					}
				}
				break;
				
			case 2:
				pkt = new Packet(lecDB.readFile());
				
				writeToSocket(pkt);

				break;
			}
		}
	}
}