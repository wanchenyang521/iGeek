package com.igeek;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("test02.txt");
		//写出一个字节
		out.write(97);
		out.close();
	}

}
