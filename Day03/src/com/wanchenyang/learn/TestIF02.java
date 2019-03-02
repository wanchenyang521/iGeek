package com.wanchenyang.learn;
/**
 * 
 * @author: 晨阳
 * @date:   2019年3月1日 上午8:52:37   
 * @version V1.0 
 * @Description:
 */
public class TestIF02
{
	public static void main(String[] args)
	{
//		该值大于等于 0.0 且小于 1.0
//		double temp = Math.random();
//		System.out.println(temp*10+1);
//		
//		int h = (int)(6*(Math.random())+1);
//		System.out.println(h);
//		if(h<3) 
//		{
//			System.out.println("Min");
//		}
		
		//三个骰子，若三个骰子之和大于15输出手气不错
		//10-15 一般
		//3-10差
		int sum = 0;
		for (int i = 0; i < 3; i++)
		{
			int temp = (int)(6*(Math.random())+1);
			sum+=temp;
			System.out.println(i+1+"次:"+temp);
		}
		System.out.println("骰子数之和："+sum);
		if(sum>15) 
		{
			System.out.println("手气不错");
		}
		else if(sum>=10&&sum<=15) 
		{
			System.out.println("一般");
		}
		else 
		{
			System.out.println("差");
		}
		
	}
}
