package com.wanchenyang.homework;

/**
 * 
 * @author: 晨阳
 * @date: 2019年3月1日 下午4:45:45
 * @version V1.0
 * @Description:看程序说结果，请不要提前运行？
 */
public class Extend02
{
	public static void main(String[] args)
	{
		int x = 1, y = 1;
		if (x++ == 1 | ++y == 1)
		{
			x = 7;
		}
		System.out.println("x=" + x + ",y=" + y);

		int a = 1, b = 1;
		if (a++ == 1 || ++b == 1)
		{
			a = 7;
		}
		System.out.println("a=" + a + ",b=" + b);

		boolean c = true;
		if (c == false)
			System.out.println("a");
		else if (c)
			System.out.println("b");
		else if (!c)
			System.out.println("c");
		else
			System.out.println("d");
	}

}
