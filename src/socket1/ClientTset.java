package socket1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTset {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("127.0.0.1", 3800);
		
		OutputStream outputStream = socket.getOutputStream();
		String mesage  = "i am shangcg";
		outputStream.write(mesage.getBytes("UTF-8"));
		outputStream.close();
		socket.close();
	}

}
