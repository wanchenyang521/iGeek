package com.wanchenyang.homework;

/**
 * 
 * @author: ����
 * @date: 2019��3��1�� ����4:11:05
 * @version V1.0
 * @Description:ʹ��forѭ��,���1-100֮�������֮��.
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
		System.out.println("������Ϊ" + sum);

	}

}
