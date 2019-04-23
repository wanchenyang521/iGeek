package com.learn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年4月16日
 * @version 1.0
 * @description:ByteArrayOutputStream 输出流
 */
public class Test08 {

	public static void main(String[] args) throws IOException {
		byte[] dest;
		
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		byte[] src = "talk is cheap,show me the code".getBytes();
		bo.write(src, 0, src.length);
		bo.flush();
		//获取数据
		dest = bo.toByteArray();
		System.out.println(dest.length+"-->"+new String(dest,0,dest.length));
		
	}

}
