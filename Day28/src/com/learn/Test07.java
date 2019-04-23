package com.learn;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年4月16日
 * @version 1.0
 * @description:ByteArrayInputStream
 */
public class Test07 {

	public static void main(String[] args) throws IOException {
		
		byte[] src = "talk is cheap,show me the code".getBytes();
		
		ByteArrayInputStream is = new ByteArrayInputStream(src);
		
		byte[] temp = new byte[4];
		int len = -1;
		while((len = is.read(temp))!= -1) {
			//字节数组--》字符串
			String str = new String(temp, 0, len);
			System.out.println(str);
		}

	}

}
