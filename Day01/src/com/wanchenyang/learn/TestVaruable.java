package com.wanchenyang.learn;
/**
 * 
 * @Description: 变量
 * @author: 晨阳
 * @date:   2019年2月27日 下午3:49:37   
 * @version V1.0
 */
public class TestVaruable
{
	/*
	 * 变量（局部变量）
	 * 1.局部变量，使用时初始化
	 * 2.生命周期，声明的位置到方法或者语句块执行结束为止
	 * 
	 * 变量（成员变量）
	 * 类内部定义的变量方法外面的
	 * 有默认初始化
	 *生命周期：伴随着对象
	 *
	 *变量（静态变量）
	 *1.生命周期：从属于类
	 * 
	 * */
	static int size; //静态变量
	
//	变量（成员变量）
	int salary;
	public static void main(String[] args)
	{
		{
			int age = 10;
		}
//		变量（局部变量）
		int i = 20;
		int j = i+5;
		System.out.println(j);
//		System.out.println(age);
		TestVaruable temp = new TestVaruable();
		System.out.println(temp.salary);
		System.out.println(size);
		System.out.println(TestVaruable.size);
		
	}
}
