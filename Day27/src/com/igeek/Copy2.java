package com.igeek;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author zx
 * @date 2019年4月15日
 * @version 1.0
 * @description:文件拷贝
 */
public class Copy2 {

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		copyFile("test02.txt", "test03.txt");
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	
	//文件拷贝
	public static void copyFile(String srcPath,String destPath) {
		//创建源
		File src = new File(srcPath); 
		File desc = new File(destPath);
		
		//选择流
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new BufferedInputStream(new FileInputStream(src));
			out = new BufferedOutputStream( new FileOutputStream(desc));
			
			byte[] temp = new byte[1024];
			int length = -1;
			while((length = in.read(temp)) != -1) {
				out.write(temp, 0, length);
			}
			out.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//释放资源，分别关闭，先打开的后关闭
			try {
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
