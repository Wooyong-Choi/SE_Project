package ocsf;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public abstract class SocketCommunication {
	
	protected Socket sock;
	
	protected Packet readFromSocket() {
		try {
			ObjectInputStream in = new ObjectInputStream(sock.getInputStream());
			
			return (Packet) in.readObject();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	protected void writeToSocket(Packet data) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(sock.getOutputStream());
			
			out.writeObject(data);
			
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
