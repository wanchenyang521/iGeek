package com.wanchenyang.learn;

/**
 * 
 * @author: ����
 * @date: 2019��3��1�� ����11:26:33
 * @version V1.0
 * @Description:�žų˷���
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
		System.out.println("-��-��-а-��-��-��-��-��--");

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
