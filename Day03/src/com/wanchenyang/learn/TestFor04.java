package com.wanchenyang.learn;

/**
 * 
 * @author: ����
 * @date: 2019��3��1�� ����2:41:11
 * @version V1.0
 * @Description:for 1-1000 ��5������ÿ�������
 */
public class TestFor04
{
	public static void main(String[] args)
	{
//		��¼ÿ�д�ӡ����
		int num = 0;
		for (int i = 1; i <= 1000; i++)
		{
			if (i % 5 == 0)
			{
				System.out.print(i + " ");
				num++;
				if (num % 5 == 0)
				{
					System.out.println();
					num = 0;
				}

			}

//			if(i%25==0) 
//			{
//				System.out.println();
//			}
		}

	}

}
