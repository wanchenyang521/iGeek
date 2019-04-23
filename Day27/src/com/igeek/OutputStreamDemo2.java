package com.igeek;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年4月15日
 * @version 1.0
 * @description:
 *  public void write(byte[] b)	写出一个字节数组的字节
*  
	*  输出流的源代码实现:如果输出时没有该文件,则会先创建该文件,再输出数据
	*  默认的写出是覆盖掉了文件以前的内容,如果想每次运行程序写出数据不覆盖之前的内容,使用特定的构造方法
	*  public FileOutputStream(String name,boolean append) append参数:是否追加数据
	*  
	*  在FileOutputStream的构造方法当中,指定的io资源可以是文件对象,也可以是文件路径,其本质是相同的.
	*  一般情况下直接使用给予文件路径的方式创建IO流对象,因为源代码中会自动帮助我们创建File对象.

 */
public class OutputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		//append if true, then bytes will 
		//be written to the end of the file rather than the beginning
		FileOutputStream out = new FileOutputStream("test03.txt");
		
		byte[] bytes = {97,98,99};
		out.write(bytes);
		out.close();

	}

}
