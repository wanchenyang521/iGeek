package com.wanchenyang.homework;

/**
 * 
 * @author: 晨阳
 * @date: 2019年3月1日 下午4:13:50
 * @version V1.0
 * @Description:求出1到100之间的既是3的倍数又是5倍数的数字之和
 */
public class Test03
{

	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 1; i < 101; i++)
		{
			if(i%3==0&&i%5==0) 
			{
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("和为："+sum);
	}

}
