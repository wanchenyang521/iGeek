package com.wanchenyang.homework;

/**
 * 
 * @author: ����
 * @date: 2019��3��1�� ����4:43:42
 * @version V1.0
 * @Description:������˵������벻Ҫ��ǰ���У�
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
