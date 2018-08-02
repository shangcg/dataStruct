package io_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * 最简单的复制文件
 * @author Administrator
 *
 */
public class ReadFile {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:/test.txt");
		
		InputStream inputStream = new FileInputStream(file);
		
		OutputStream outputStream = new FileOutputStream("D:/test1.txt");
		
		byte[] bytes = new byte[1024];
		
		inputStream.read(bytes);
		
		outputStream.write(bytes, 0, bytes.length);
		
	}

}
