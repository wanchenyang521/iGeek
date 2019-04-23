package com.learn;

import java.io.Serializable;

/**
 * @author zx
 * @date 2019年4月16日
 * @version 1.0
 * @description:
 * 普通类需要实现序列化接口，开启其序列化功能
*    
*    序列化ID(serialVersionUID,序列化版本号)，用于记录该对象的类型。
*    每个被序列化操作的对象其对象ID与接收类型的ID必须相同。
 */
public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1191076607521105827L;

	private String name;

	/**
	 * @Fields age : 年龄
	 */
	private int age;

	/**
	 * @Title: Person
	 */
	public Person() {
		super();
	}

	/**
	 * @Title: Person
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
