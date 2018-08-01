package socket1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 最基本的socket测试
 * 						服务端
 * @author shangcg
 *
 */
public class Server1 {

	public static void main(String[] args) throws IOException {
		
		//创建serverSocket 指定端口号
		ServerSocket server = new ServerSocket(3900);
		
		//一直等待连接..................
		Socket socket = server.accept();
		
		InputStream inputStream = socket.getInputStream();
		StringBuilder sb = new StringBuilder();
		byte[] bytes = new byte[1024];
		int len=0;
		while((len = inputStream.read(bytes)) !=-1){
			sb.append(new String(bytes, 0, len,"utf-8"));
		}
		System.out.println("接收数据:" + sb);
		inputStream.close();
		socket.close();
		server.close();
		
	}
}
