package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午7:23:30   
 * @version V1.0 
 * @Description:键盘录入两个int类型的数据,交换这两个变量的值,并输出交换后的值
 */
public class Extend01
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入num1");
		int num1 = input.nextInt();
		System.out.println("请输入num2");
		int num2 = input.nextInt();
		System.out.println("交换前\tnum1:"+num1+"\tnum2:"+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("交换后\tnum1:"+num1+"\tnum2:"+num2);
	}
}
