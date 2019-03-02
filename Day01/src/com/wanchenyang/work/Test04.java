package com.wanchenyang.work;

import java.util.Scanner;

/**
 * 
 * @Description:打印棱形
 * @author: 晨阳
 * @date:   2019年2月28日 上午8:47:31   
 * @version V1.0
 */
public class Test04
{
	public static void main(String[] args)
	{
//		手动输入需要考虑奇偶数
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入层数");
//		int nums= input.nextInt(); 

		
		int level = 4;  //上部分行数
//		打印上部分
		for(int i = 1;i <= level; i++) 
		{
//			前部分空格
			for(int j = 1 ;j<=level-i;j++) 
			{
				System.out.print(" ");
			}		
			for(int m = 1;m <= 2*i-1; m++) 
			{
//				打印*
				if(m==1 || m == 2*i-1) 
				{
					System.out.print("*");
				}
//				打印空心部分
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
//		打印下部分与上部分相反
		for(int i = level-1;i >= 1; i--) 
		{
//			前部分空格
			for(int j =level-i ;j>=1;j--) 
			{
				System.out.print(" ");
			}		
			for(int m = 2*i-1;m >=1 ; m--) 
			{
//				打印*
				if(m==1 || m == 2*i-1) 
				{
					System.out.print("*");
				}
//				打印空心部分
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	
	}
}
