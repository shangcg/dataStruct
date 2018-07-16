package n1807;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 管道输入 输出流
 * 
 * 管道的输入输出 不同于普通文件的输入输出之处在于：
 * 				管道输入输出用于线程线程之间的通信，传输媒介是内存
 * @author shangcg
 *
 */
public class Piped {
	
	
	public static void main(String[] args) throws IOException {
		PipedWriter out = new PipedWriter();
		PipedReader in = new PipedReader();
		
		//输出流和输入流进行连接
		out.connect(in);
		Thread printThread = new Thread(new Print(in),"printThread");
		printThread.start();
		int recive = 0;
		try {
			System.out.println("runing1");
			while((recive = System.in.read()) != -1){
				out.write(recive);
			}
		} finally {
			out.close();
		}
	}
	
	static class Print implements Runnable{
		
		private PipedReader in;
		
		public Print(PipedReader in){
			this.in = in;
		}

		@Override
		public void run() {
			int recive = 0;
			try {
				System.out.println("runing");
				while((recive = in.read()) != -1){
					System.out.print((char)recive);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
