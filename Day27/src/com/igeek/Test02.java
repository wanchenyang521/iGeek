package com.igeek;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author zx
 * @date 2019年4月15日
 * @version 1.0
 * @description:FileOutputStream(字节流)
 */
public class Test02 {

	public static void main(String[] args) {
		
		File file = new File("abc.txt");
		OutputStream out = null;
		try {
			//选择合适的流
			out = new FileOutputStream(file);
			String msg = "talk is cheap,show me the code";
			//Encodes this String into a sequence of bytes 
			//字符串--endode-- > 字节数组
			byte[] bs = msg.getBytes();
			out.write(bs, 0, bs.length);
			out.flush();
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
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
