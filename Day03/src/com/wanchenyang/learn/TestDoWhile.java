package com.wanchenyang.learn;
/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����10:59:48   
 * @version V1.0 
 * @Description:do while
 */
public class TestDoWhile
{

	public static void main(String[] args)
	{
		int i = 1;
		int sum = 0;
		do 
		{
			sum+=i++;
		}while(i<=100);
		System.out.println(sum);

	}

}
