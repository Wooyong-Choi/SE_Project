package ocsf;

import java.net.Socket;

import info.Student;

public class Client {
	private Student std;
	private Socket sock;
	
	public static void main(String[] args) {
		new Thread(new CommunicationThread("localhost", 8888)).start();
		
		
	}
}
