package com.learn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年4月16日
 * @version 1.0
 * @description:FileReader(基本字符输入流)
 * 
 * 输入流：
*  		Reader(抽象类)
*  		FileReader(基本字符输入流)
*  构造方法：需要绑定IO资源
*  		public FileReader(String name)
*  
*  其他方法：读取时，返回数据时，使用int替代了char
*  		int read()：读取一个字符；
*  		int read(char[] c)：读取一个字符数组；
*  		close()：由于每个IO流都需要绑定一个IO资源，在使用时，需要回收资源。

 */
public class Test02 {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("test.txt");
		
		int temp = -1;
//		temp = fileReader.read();
//		System.out.println((char)temp);
		while((temp = fileReader.read()) != -1) {
			System.out.println((char)temp);
		}
		
		fileReader.close();
		
		FileReader fileReader2 = new FileReader("test.txt");
		char[] arr = new char[1024];
		int len = -1;
		while((len = fileReader2.read(arr)) != -1) {
			String str = new String(arr, 0, len);
			System.out.println(str);
		}
		fileReader2.close();

	}

}
