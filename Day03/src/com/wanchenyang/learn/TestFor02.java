package com.wanchenyang.learn;

/**
 * 
 * @author: ����
 * @date: 2019��3��1�� ����11:22:41
 * @version V1.0
 * @Description:ˮ�ɻ���
 */
public class TestFor02
{
	public static void main(String[] args)
	{
		for (int i = 100; i <= 999; i++)
		{
			int num1 = i % 10; //
			int num2 = i / 10 % 10;
			int num3 = i / 10 / 10 % 10;
			if (Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3) == i)
			{
				System.out.println(num3 + " " + num2 + " " + num1);
				System.out.print(Math.pow(num3, 3) + " " + Math.pow(num2, 3) + " " + Math.pow(num1, 3));
				System.out.println("=" + (Math.pow(num3, 3) + Math.pow(num2, 3) + Math.pow(num1, 3)));
				System.out.println(i);
			}

		}
	}
}
