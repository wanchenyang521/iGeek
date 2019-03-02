package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date: 2019年3月1日 下午4:16:20
 * @version V1.0
 * @Description: 从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和: 1.数字的个位数不为7;
 *               2.数字的十位数不为5; 3.数字的百位数不为3;
 */
public class Test04
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个大于100的三位数,输入0结束");
		int num = input.nextInt();
		while(true) 
		{
			if(num==0) 
			{
				break;
			}
			if (num <= 100)
			{
				System.out.println("输入非法，请输入一个大于100的三位数");
				num = input.nextInt();
			} 
			else
			{
				int num1 = 0;
				int num2 = 0;
				int num3 = 0;
				int sum = 0;
				for (int i = 100; i <= num; i++)
				{
					num1 = i % 10;
					num2 = i / 10 % 10;
					num3 = i / 100 % 10;
					if (num1 != 7 && num2 != 5 && num3 != 3)
					{
						System.out.println(i);
						sum += i;
					}
				}
				System.out.println("和为：" +sum);
				
				System.out.println("请输入一个大于100的三位数,输入0结束");
				num = input.nextInt();
			}
		}

	}

}
