package com.wanchenyang.learn;
/**
 * 
 * @author: 晨阳
 * @date:   2019年3月1日 上午9:57:21   
 * @version V1.0 
 * @Description:
 */
public class TestIfElseifElse
{
	public static void main(String[] args)
	{
		int age = (int) (100*Math.random());
		System.out.println(age);
		if(age<15) 
		{
			System.out.println("儿童");
		}
		else if(age<30) 
		{
			System.out.println("青年");
		}
		else if(age<50) 
		{
			System.out.println("中年");
		}
		else if(age<65) 
		{
			System.out.println("中老年");
		}
		else
		{
			System.out.println("老年");
		}
	}
}
