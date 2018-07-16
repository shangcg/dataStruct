package socket_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {
	Socket socket = null;
	public ServerThread(Socket socket){
		this.socket = socket;
	}
	
	public void run(){
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStream os = null;
		PrintWriter pw = null;
		try {
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String data = null;
			while((data = br.readLine()) != null){
				System.out.println("我是服务端，客户端信息为：" + data);
			}
			socket.shutdownInput();
			os = socket.getOutputStream();
			pw = new PrintWriter(os);
			pw.write("欢迎\n");
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pw.close();
				os.close();
				br.close();
				isr.close();
				is.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}

