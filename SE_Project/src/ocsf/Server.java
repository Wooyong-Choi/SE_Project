package ocsf;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	
	public static void main(String[] args) throws IOException {

		ServerSocket s_sock = new ServerSocket(Common.portNum);

		System.out.println("���� ����");
		
		while (true) {
			System.out.println("��ٸ��� ��...");
			
			AcceptThread acptThd = new AcceptThread(s_sock.accept());
			new Thread(acptThd).start();
			
			System.out.println("���� Connection Request...");
		}
	}
}

