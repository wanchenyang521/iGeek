package com.wanchenyang.learn;
/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����10:52:02   
 * @version V1.0 
 * @Description:while
 */
public class TestWhile
{

	public static void main(String[] args)
	{
		int i = 1;
		int sum = 0;
		while(i<=100) 
		{
			sum+=i++;
		}
		System.out.println(sum);

	}

}
