package com.wanchenyang.learn;

/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午2:33:38   
 * @version V1.0 
 * @Description:算术运算符 
 * ++ --
 * + - * / %（模，取余） 
 * 
 * 整数运算：
 * 1.两个操作数中有一个Long,结果也为Long
 * 2.两个操作数中有一个double,结果也为double
 * 
 */
public class TestOperation01
{
	public static void main(String[] args)
	{
		byte num1 = 1;
		int num2 = 2;
//		byte num3 = num1 + num2 ;
		int num3 = num1 + num2 ;
		
		long num4 = 3;
		long num5 = num4 + num3;
		
		float num6 = 3.14F;
		double num7 = num6+6.28;
		
		float num8 = 3.14F;
		
		float num9 = num6+num8;
		
		System.out.println(7/3);
		System.out.println(7%3);
		System.out.println(7%-3);
		System.out.println(-7%3);
		System.out.println(-7%-3);
		
		int a = 2;
		int a1 = a++;
		System.out.println("a:"+a);
		System.out.println("a1:"+a1);
		
		int b = 3;
		int b1 = ++b;
		System.out.println("b:"+b);
		System.out.println("b1:"+b1);
		
		int c = 3;
		++c;
		c++;
		System.out.println(c);
		
		
		
		
		
		
	}
}
