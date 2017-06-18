package ocsf;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket s_sock = new ServerSocket(8888);

		AcceptThread acptThd = new AcceptThread(s_sock);
		new Thread(acptThd).start();
		
	}
}

