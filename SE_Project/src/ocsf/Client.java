package ocsf;

import gui.Event_Control;

public class Client {
	
	public static void main(String[] args) {
		
		new Thread(new Event_Control()).start();
		
		System.out.println("�α��� layout ����");
	}
}
