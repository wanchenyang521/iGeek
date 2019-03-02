package com.wanchenyang.learn;

/**
 * 
 * @author: 晨阳
 * @date: 2019年3月1日 上午11:26:33
 * @version V1.0
 * @Description:九九乘法表
 */
public class TestFor03
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + "x" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println("-我-是-邪-恶-的-分-割-线--");

		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}

}
