package socket1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(3800);
		
		//一直等待连接的到来
		System.out.println("一直在等待连接...................");
		Socket socket = server.accept();
		
		//建立好连接后，从socket中获取输入流，并建立缓冲区读取数据
		InputStream inputStream = socket.getInputStream();
		
		
		StringBuilder sb = new StringBuilder();
		byte[] bytes = new byte[1024];
		
		int len = 0;
		while((len = inputStream.read(bytes)) != -1){
			sb.append(new String(bytes,0,len,"utf-8"));
		}
		
		System.out.println("接收数据为：" + sb);
		inputStream.close();
		socket.close();
		
	}
}
