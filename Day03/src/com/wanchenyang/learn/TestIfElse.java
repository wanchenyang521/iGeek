package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年3月1日 上午9:16:36   
 * @version V1.0 
 * @Description: if..else..
 */
public class TestIfElse
{
	public static void main(String[] args)
	{
//		System.out.println("Please input");
//		Scanner input = new Scanner(System.in);
//		int num = input.nextInt();
//		if(num%2==0)
//		{
//			System.out.println(num+"是偶数");
//		}
//		else 
//		{
//			System.out.println(num+"是奇数");
//			
//		}
//		
		/**
		 * 根据随机数生成【0，4）的圆的半径，求圆的面积和周长
		 */
		double r = 4*Math.random();
		double s = Math.PI*Math.pow(r, 2);
		double l = 2*Math.PI*r;
		System.out.println("r:"+r);
		System.out.println("s:"+s);
		System.out.println("l:"+l);
		if(s>l) 
		{
			System.out.println("s>l");
		}
		else 
		{
			System.out.println("l>s");
		}
		
		
	}

}
