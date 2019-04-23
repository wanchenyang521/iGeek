package com.igeek;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zx
 * @date 2019年4月15日
 * @version 1.0
 * @description:字节流
 */
public class Test01 {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		InputStream in = null;
		try {
			//根据需求，选择合适的流，字节流
			in = new FileInputStream(file);
//			int data = in.read();
//			System.out.println((char)data);
			int temp;
			while((temp = in.read())!= -1) {
				System.out.print((char)temp);
			}
			//释放资源
//			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//释放资源
		finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
