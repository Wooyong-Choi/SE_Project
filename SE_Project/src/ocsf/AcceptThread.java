package ocsf;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;

public class AcceptThread extends SocketCommunication implements Runnable {

	private ServerSocket s_sock;

	public AcceptThread(ServerSocket s_sock) {
		this.s_sock = s_sock;
	}

	@Override
	public void run() {
		try {
			while(true) {
				sock = s_sock.accept();
				
				ObjectInputStream in = new ObjectInputStream(sock.getInputStream());
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}