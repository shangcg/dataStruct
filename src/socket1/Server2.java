package socket1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 接收客户端数据并返回数据的socket 服务端
 * @author shangcg
 *
 */
public class Server2 {
	
	public static void main(String[] args) throws IOException {
		
		//创建socket server
		ServerSocket server = new ServerSocket(4100);
		
		//等待客户端连接
		System.out.println("waiting client ................");
		Socket socket = server.accept();
		
		//有客户端请求就读取输入流
		InputStream inputStream = socket.getInputStream();
		byte[] bytes = new byte[1024];
		StringBuilder sb = new StringBuilder();
		
		int len;
		while((len = inputStream.read(bytes)) != -1){
			sb.append(new String(bytes,0,len,"utf-8"));
		}
		System.out.println("clietn send data is"+ sb);
		
		//获取服务端的输出流
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write(("server already recive client data and return data is" +"i already recive").getBytes());
		
		outputStream.close();
		socket.close();
		server.close();
		
	}

}
