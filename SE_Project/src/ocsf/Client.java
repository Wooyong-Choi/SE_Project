package ocsf;

import gui.Event_Control;

public class Client {
	
	public static void main(String[] args) {

		System.out.println("GUI Ω√¿€");
		new Thread(new Event_Control()).start();
	}
}
