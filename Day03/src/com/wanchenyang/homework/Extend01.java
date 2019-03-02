package com.wanchenyang.homework;

/**
 * 
 * @author: 晨阳
 * @date: 2019年3月1日 下午4:43:42
 * @version V1.0
 * @Description:看程序说结果，请不要提前运行？
 */
public class Extend01
{

	public static void main(String[] args)
	{
		int x = 1, y = 1;
		if (x++ == 2 & ++y == 2)
		{
			x = 7;
		}
		System.out.println("x=" + x + ",y=" + y);
		int a = 1, b = 1;
		if (a++ == 2 && ++b == 2)
		{
			a = 7;
		}
		System.out.println("a=" + a + ",b=" + b);
	}

}
