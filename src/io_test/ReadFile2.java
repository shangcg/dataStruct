package io_test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 利用字节缓冲区 对文件进行读写
 * @author shangcg
 *
 */
public class ReadFile2 {

	public static void main(String[] args) throws IOException {
		
		//加载文件
		
		File file = new File("D:/test.txt");
		
		//创建输入流
		InputStream in = new FileInputStream(file);
		//创建缓冲流
		BufferedInputStream buffer = new BufferedInputStream(in);
		
	
		//定义一次读取的数据  1K大小
		byte[] bytes = new byte[1024];
		
		//实际读取的字节数
		int len;
		
		while((len = buffer.read(bytes)) != -1){
			System.out.println(new String(bytes,0,len));
		}
		
		
	}
}
