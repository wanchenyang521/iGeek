package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午7:03:23   
 * @version V1.0 
 * @Description:键盘录入自己的姓名(String),年龄(int),身高(int)保存到对应的变量中
 * 输出结果如:我的姓名是张三,年龄25岁,身高180CM
 * (提示姓名是String类型,需要使用Scanner的next()方法.)
 */
public class Test03
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入姓名");
		String name = input.next();
		System.out.println("请输入年龄");
		int age = input.nextInt();
		System.out.println("请输入身高");
		int height = input.nextInt();
		System.out.println("我的姓名是"+name+",年龄"+age+"岁,身高"+height+"CM");
	}
}
