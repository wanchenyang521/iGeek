package com.wanchenyang.learn;

/**
 * 
 * @author: 晨阳
 * @date: 2019年3月1日 下午2:41:11
 * @version V1.0
 * @Description:for 1-1000 被5整除，每五个换行
 */
public class TestFor04
{
	public static void main(String[] args)
	{
//		记录每行打印几个
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
