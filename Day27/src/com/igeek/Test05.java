package com.igeek;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test05 {

	public static void main(String[] args) {
		File file = new File("abc.txt");
		InputStream in = null;
		try {
			in = new BufferedInputStream
					(new FileInputStream(file));
			//读数据
			byte[] temp = new byte[1024];
			int length = -1;
			while((length = in.read(temp)) !=-1) {
				String str = new String(temp, 0, length);
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null)
					in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
				
		

	}

}
