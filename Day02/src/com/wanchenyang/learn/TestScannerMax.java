package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午4:29:42   
 * @version V1.0 
 * @Description:三个数比较大小
 */
public class TestScannerMax
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个数据：");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		
		int temp = num1>num2?num1:num2;
		int max = temp>num3?temp:num3;
		int max2 = ((num1>num2?num1:num2)>num3?(num1>num2?num1:num2):num3);
		System.out.println(max);
		System.out.println(max2);
		

	}

}
