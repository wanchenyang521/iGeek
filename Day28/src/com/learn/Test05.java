package com.learn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author zx
 * @date 2019年4月16日
 * @version 1.0
 * @description:
 * 
 * 需求:
*  		已经具备字节流,绑定了IO资源
*  		需要将字节流转成字符流
*  
*  	此时,可以使用转换流,接收一个字节流对象,进行字符流的操作.
*  	转换流本身就是字符流
*  
*  	转换流:
*  		Reader:
*  			InputStreamReader可以完成字节输入流转换为字符输入流
*  		Writer:
*  			OutputStreamWriter可以完成字节输出流转换为字符输出流。
*  
*  	则转换流的使用方法:
*  		构造方法传入字节流对象
*  		自身调用字符流的方法

 */
public class Test05 {

	public static void main(String[] args) throws IOException {
		//字节拿到流
		FileOutputStream fo = new FileOutputStream("test3.txt");
		OutputStreamWriter streamWriter = new OutputStreamWriter(fo);
		
		streamWriter.write("hello,Java");
		
		streamWriter.close();
		

	}

}
