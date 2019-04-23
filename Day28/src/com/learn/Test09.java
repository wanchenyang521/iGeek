package com.learn;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * 
 * @author zx
 * @date 2019年4月16日
 * @version 1.0
 * @description:
 * DataInputStream
 * DataOutputStream
 */
public class Test09 {

	public static void main(String[] args) throws IOException {
		
		ByteArrayOutputStream ba = new ByteArrayOutputStream();
		DataOutputStream dataOut = new DataOutputStream(ba);
		
		//数据类型+数据
		dataOut.writeUTF("hi,java");;
		dataOut.writeInt(18);
		dataOut.writeBoolean(false);
		dataOut.writeChar('a');
		dataOut.flush();
		
		//获取数据
		byte[] datas = ba.toByteArray();
		DataInputStream dataIn = new DataInputStream(new ByteArrayInputStream(datas));
		//按顺序来读
		String name = dataIn.readUTF();
		int i = dataIn.readInt();
		boolean flag = dataIn.readBoolean();
		char ch = dataIn.readChar();
		System.out.println(i);
		System.out.println(flag);
		System.out.println(ch);
		System.out.println(name);
	}

}
