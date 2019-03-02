package com.wanchenyang.work;
/**
 * 
 * @Description:在控制台输出三角图形
 * @author: 晨阳
 * @date:   2019年2月28日 上午9:22:18   
 * @version V1.0
 */
public class Test06
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
