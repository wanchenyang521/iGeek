package com.learn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年4月16日
 * @version 1.0
 * @description:
 * 高效原理:
*  		缓冲区临时存储多个数据,一次调用底层资源,减少调用底层资源的次数,提高了程序运行的速度
*  
*  高效缓冲流:
*  		BufferedReader/BufferedWriter
*  
*  高效流字符流的方法比普通流的方法更多
*  高效流的构造方法接收普通流对象,在普通流的基础上增加了缓冲区
*  
*  高效流write写出数据时,写出位置为缓冲区,并非目标资源.
*  需要通过flush刷新方法将缓冲区的内容写出到目标文件中.
*  
*  public void flush()刷新缓冲区,将内容写到目标文件中
*  public void close()方法会调用flush方法

 */
public class Test03 {

	public static void main(String[] args) throws IOException {
		//拿到流
		FileWriter fileWriter = new FileWriter("test2.txt");
		BufferedWriter bw = new BufferedWriter(fileWriter);
		
		//写数据
		bw.write("talk is cheap,show me the code");
		bw.newLine();
		bw.write("practise make perfect");
		bw.newLine();
		
		bw.flush();
		bw.close();
		
		//
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
//		char[] chs = new char[1024];
//		int len = -1;
//		while((len = br.read(chs)) != -1) {
//			String str = new String(chs, 0, len);
//			System.out.println(str);
//		}
		//读一行
		String temp = null;
		while((temp = br.readLine()) != null) {
			System.out.println(temp);
		}
		
		br.close();

	}

}
