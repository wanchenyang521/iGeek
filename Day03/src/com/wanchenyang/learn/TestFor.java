package com.wanchenyang.learn;
/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����11:09:33   
 * @version V1.0 
 * @Description:for
 */
public class TestFor
{

	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 1; i <= 100; i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 1; i <= 100; i++)
		{
			if(i%2==0) 
			{
				sum2+=i;				
			}
			else 
			{
				sum3+=i;
			}
		}
		System.out.println("ż��"+sum2);	
		System.out.println("����"+sum3);	

	}

}
