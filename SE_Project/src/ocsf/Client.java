package ocsf;

import java.net.Socket;

import gui.Event_Control;
import info.Student;

public class Client {
	private Student std;
	private Socket sock;
	
	public static void main(String[] args) {
		String hostAddr = "localhost";
		int portNum = 8888;
		
		//new Thread(new CommunicationThread(hostAddr, portNum)).start();
		
		new Thread(new Event_Control()).start();
		
		System.out.println("로그인 layout 시작");
	}
}
