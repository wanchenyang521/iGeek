package com.wanchenyang.work;

public class Test07
{

//	public static void main(String[] args) 
//	{
//		int a = 0; // 没有初始化
//		System.out.println(a);
//		{
//			int c = 20;
//			System.out.println(c);
//		}
//		int c = 30;	//
//		System.out.println(c);
//	}
	
	
	public static void main(String[] args) {
		int x = 2;
		{
			int y = 6;
			System.out.println("x is " + x);
			System.out.println("y is " + y);
		}
		int y = x;  //
		System.out.println("x is " + x);
	}



}
