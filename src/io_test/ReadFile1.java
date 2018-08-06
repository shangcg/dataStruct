package io_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 读取硬盘上某个文件
 * 		每次读取1024个字节
 * @author shangcg
 *
 */
public class ReadFile1 {
	
	public static void main(String[] args) throws IOException {
		
		//读取文件
		File file = new File("D:/test.txt");
		
		//创建输入流
		InputStream in = new FileInputStream(file);
		
		// 缓冲数组  存放每次读取的数据  
		byte[] bytes = new byte[1024];
		
		//从输入流读取单个字节
		int len;
		while((len = in.read(bytes)) != -1){
			System.out.println(new String(bytes,0,len));
		}
	}
	

}
