package com.igeek;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年4月15日
 * @version 1.0
 * @description:
  *    高效字节缓冲流
 * BufferedInputStream/BufferedOutputStream
 */
public class Test04 {

	public static void main(String[] args) throws IOException {
//		FileOutputStream out = new FileOutputStream("test04.txt");
//		
//		BufferedOutputStream bo = new BufferedOutputStream(out);
		//高效字节缓冲流来处理
		BufferedOutputStream bo = 
				new BufferedOutputStream(
						new FileOutputStream("test04.txt"));
		
//		bo.write(101);
		bo.write(new byte[] {97,98,99});
		
		bo.flush();
		
		bo.close();

	}

}
