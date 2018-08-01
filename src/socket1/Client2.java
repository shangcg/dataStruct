package socket1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 带发送和接受的socket客户端
 * @author shangcg
 *
 */
public class Client2 {
	
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//建立socket连接
		Socket socket = new Socket("127.0.0.1",4100);
		
		//获取输出流
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("i am client2".getBytes());
		
		//发送数据并关闭输出流
		socket.shutdownOutput();
		
		//接收服务端返回数据
		InputStream inputStream  = socket.getInputStream();
		byte[] bytes = new byte[1024];
		StringBuilder sb = new StringBuilder();
		int len;
		while((len = inputStream.read(bytes)) != -1){
			sb.append(new String(bytes,0,len,"utf-8"));
		}
		System.out.println("recive server return data is "+ sb);
		inputStream.close();
		socket.close();
	}

}
