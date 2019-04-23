package com.igeek;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年4月15日
 * @version 1.0
 * @description:字符流回顾
 * 
   * 向一个文件中写出字符"hello java",从一个文件中读取字符
 */
public class CharStreamDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("test.txt");
		fw.write("hello java");
		fw.close();
		
		//读取字符
		FileReader fr = new FileReader("test.txt");
		
		int read = fr.read();
		System.out.println((char)read);
		
		int read2 = fr.read();
		System.out.println((char)read2);
		
		fr.close();
	}
	
	

}
