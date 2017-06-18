package ocsf;

import java.net.Socket;

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
					if (std.getID().equals(usr.getID())	&& std.getPassword().equals(std.getPassword())) {
						// 로그인 성공
						writeToSocket(new Packet(std));

					} else {
						// 로그인 실패
						writeToSocket(new Packet());
					}
				}
				break;

			case 1:
				pkt = new Packet(lecDB.readFile());
				
				writeToSocket(pkt);

				break;
			}
		}
	}
}