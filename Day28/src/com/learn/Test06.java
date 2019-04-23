package com.learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zx
 * @date 2019年4月16日
 * @version 1.0
 * @description:InputStreamReader的使用
 */
public class Test06 {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("test3.txt");
		int b = -1;
		while((b = fi.read())!= -1) {
			System.out.println((char)b);
		}
		fi.close();
		System.out.println("###############");
		//转换字符流
		InputStreamReader ir = new InputStreamReader(
				new FileInputStream("test3.txt"));
		int temp = -1;
		while((temp = ir.read())!= -1) {
			System.out.println((char)temp);
		}
		
		char[] chs = new char[1024];
		int len = -1;
		while((len = ir.read(chs)) != -1) {
			String str = new String(chs,0,len);
			System.out.println(str);
		}
		
		ir.close();
		

	}

}
