package ocsf;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	
	public static void main(String[] args) throws IOException {

		ServerSocket s_sock = new ServerSocket(Common.portNum);

		System.out.println("서버 시작");
		
		while (true) {
			System.out.println("기다리는 중...");
			
			AcceptThread acptThd = new AcceptThread(s_sock.accept());
			new Thread(acptThd).start();
			
			System.out.println("유저 Connection Request...");
		}
	}
}

