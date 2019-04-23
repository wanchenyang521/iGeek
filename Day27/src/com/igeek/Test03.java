package com.igeek;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test03 {

	public static void main(String[] args) {
		File file = new File("test.txt");
		InputStream in = null;
		try {
			//根据需求，选择合适的流，字节流
			in = new FileInputStream(file);
			
			byte[] temp = new byte[1024];//缓冲数组buffer
			int len = -1;//接受长度
			while( (len = in.read(temp)) != -1 ) {
				//字节数组--decode-- > 字符串
				String str = new String(temp, 0, len);
				System.out.println(str);
			}
			
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
