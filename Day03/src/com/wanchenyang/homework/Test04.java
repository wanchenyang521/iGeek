package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date: 2019��3��1�� ����4:16:20
 * @version V1.0
 * @Description: �Ӽ�����¼��һ������100����λ��,���100��������֮����������Ҫ�������֮��: 1.���ֵĸ�λ����Ϊ7;
 *               2.���ֵ�ʮλ����Ϊ5; 3.���ֵİ�λ����Ϊ3;
 */
public class Test04
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������100����λ��,����0����");
		int num = input.nextInt();
		while(true) 
		{
			if(num==0) 
			{
				break;
			}
			if (num <= 100)
			{
				System.out.println("����Ƿ���������һ������100����λ��");
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
				System.out.println("��Ϊ��" +sum);
				
				System.out.println("������һ������100����λ��,����0����");
				num = input.nextInt();
			}
		}

	}

}
