package com.wanchenyang.homework;

/**
 * 
 * @author: ����
 * @date: 2019��3��1�� ����4:13:50
 * @version V1.0
 * @Description:���1��100֮��ļ���3�ı�������5����������֮��
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
		System.out.println("��Ϊ��"+sum);
	}

}
