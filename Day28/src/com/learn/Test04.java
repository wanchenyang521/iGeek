package com.learn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test04 {

	public static void main(String[] args) throws IOException {
		//存储姓名
		ArrayList<String> arr = new ArrayList<String>();
		//拿到字符输入流
		BufferedReader br = new BufferedReader(new FileReader("g.txt"));
		String temp = null;
		while((temp = br.readLine()) != null) {
			//将读取到的姓名放到集合中
			arr.add(temp);
		}
		//释放资源
		br.close();
		
		Collections.reverse(arr);
		//拿到字符输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("g.txt"));
		for (String name : arr) {
			//一次写出一个姓名
			bw.write(name);
			bw.newLine();
		}
		
		//释放资源
		bw.close();

	}

}
