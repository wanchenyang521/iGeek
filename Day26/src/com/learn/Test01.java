package com.learn;

import java.io.File;

public class Test01
{
	public static void main(String[] args) {
		String path = "D:\\WorkSpace\\Java\\Day26";
		String path2 = "D:/WorkSpace";
		System.out.println(File.separator);
		
		String path3 = "D:"+File.separator+"WorkSpace";
		System.out.println(path2);
		System.out.println(path);
		System.out.println(path3);
		
	}
}
