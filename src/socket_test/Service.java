package socket_test;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
	public static void main(String[] args) {
		try {
			//创建serverSocket端口号为8888
			ServerSocket serverSocket = new ServerSocket(8888);
			//
			Socket socket = null;
			int count = 0;
			while(true){
				socket = serverSocket.accept();
				ServerThread serverThread = new ServerThread(socket);
				serverThread.start();
				count++;
				System.out.println("客户端数量为：" + count);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
