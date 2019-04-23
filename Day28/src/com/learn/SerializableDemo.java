package com.learn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author zx
 * @date 2019年4月16日
 * @version 1.0
 * @description:
 * 序列化流可以用来将一个对象整体转为二进制数并存储到文件中。
* 将对象永久性存入一个文件中，叫做序列化，读取叫做反序列化。
* 
* 每个被序列化操作的类型必须实现Serializable接口(具备序列化功能的标记接口),让其具备序列化能力
* 
* ObjectOutputStream序列化流
* 		public final void writeObject(Object obj)
* ObjectInputStream反序列化流
* 		public final Object readObject()

 */
public class SerializableDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("person.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Person("wb", 20));
		oos.flush();
		oos.close();
	}

}
