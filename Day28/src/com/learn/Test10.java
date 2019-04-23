package com.learn;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author zx
 * @date 2019年4月16日
 * @version 1.0
 * @description:
 */
public class Test10 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream ba = new ByteArrayOutputStream();
		ObjectOutputStream ojOut = new ObjectOutputStream(ba);

		// 数据类型+数据
		ojOut.writeUTF("hi,java");
		;
		ojOut.writeInt(18);
		ojOut.writeBoolean(false);
		ojOut.writeChar('a');
		//写对象
		//java.io.NotSerializableException
		Student student = new Student("dyz", 20);
		ojOut.writeObject(student);
		ojOut.writeObject(new Date());

		ojOut.flush();

		// 获取数据
		byte[] datas = ba.toByteArray();
		ObjectInputStream dataIn = new ObjectInputStream(new ByteArrayInputStream(datas));
		// 按顺序来读
		String name = dataIn.readUTF();
		int i = dataIn.readInt();
		boolean flag = dataIn.readBoolean();
		char ch = dataIn.readChar();
		//Read an object from the ObjectInputStream
		Object oj = dataIn.readObject();
		Object date = dataIn.readObject();
		
		System.out.println(i);
		System.out.println(flag);
		System.out.println(ch);
		System.out.println(name);
		if(oj instanceof Student) {
			Student student2 = (Student)oj;
			System.out.println(student2.getName()+"--->"+student2.getAge());
		}
		if(date instanceof Date) {
			System.out.println(date);
		}
		
		

	}

}
