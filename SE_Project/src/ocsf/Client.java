package ocsf;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import db.StudentDBAccessor;
import info.Student;

public class Client {
	private Student std;
	private Socket sock;
	
	public static void main(String[] args) {
		new Thread(new CommunicationThread("localhost", 8888)).start();
		
		
	}
}
