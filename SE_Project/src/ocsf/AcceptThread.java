package ocsf;

import java.io.IOException;
import java.net.ServerSocket;

import db.LectureDBAccessor;
import db.StudentDBAccessor;
import info.Lecture;
import info.Student;

public class AcceptThread extends SocketCommunication implements Runnable {

	private ServerSocket s_sock;
	private LectureDBAccessor lecDB;
	private StudentDBAccessor stdDB;

	public AcceptThread(ServerSocket s_sock) {
		this.s_sock = s_sock;
		
		lecDB = new LectureDBAccessor();
		stdDB = new StudentDBAccessor();
	}

	@Override
	public void run() {
		try {
			while(true) {
				sock = s_sock.accept();
				
				while(true) {
					Packet pkt = (Packet) readFromSocket();
					
					if (pkt.getData().get(0) instanceof Student) {
						
						
					} else if (pkt.getData().get(0) instanceof Lecture) {
						
						
					}
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}