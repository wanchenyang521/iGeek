package com.wanchenyang.learn;
/**
 * 
 * @author: 晨阳
 * @date:   2019年3月1日 上午10:52:02   
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
