package ocsf;

import java.io.IOException;
import java.net.Socket;

public class CommunicationThread extends SocketCommunication implements Runnable {
	
	public CommunicationThread(String hostAddr, int portNum) {
		try {
			sock = new Socket(hostAddr, portNum);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		
	}
}
