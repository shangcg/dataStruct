package socket1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


/**
 * 最基本的socket测试
 * 						客户端
 * @author shangcg
 *
 */
public class Client1 {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//与服务端 建立连接
		Socket socket = new Socket("127.0.0.1",3900);
		
		//获取输出流
		OutputStream outputStream = socket.getOutputStream();
		
		//向输出流写入数据
		outputStream.write("i am base socket test".getBytes());
		
		//关闭输出流
		outputStream.close();
		
		//关闭socket连接
		socket.close();
		
		
	}

}
