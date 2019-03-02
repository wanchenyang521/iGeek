package com.wanchenyang.homework;

/**
 * 
 * @author: 晨阳
 * @date: 2019年3月1日 下午4:11:05
 * @version V1.0
 * @Description:使用for循环,求出1-100之间的奇数之和.
 */
public class Test02
{

	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 1; i < 101; i++)
		{
			if (i % 2 == 1)
			{
				sum += i;
			}
		}
		System.out.println("奇数和为" + sum);

	}

}
