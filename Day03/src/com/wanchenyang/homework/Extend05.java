package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年3月1日 下午5:00:11   
 * @version V1.0 
 * @Description:模拟计算器功能，
 * 对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果
 * 键盘录入三个整数,其中前两个整数代表参加运算的数据
 * 第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
 */
public class Extend05
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int num1 = input.nextInt();
		System.out.println("请输入第二个数：");
		int num2 = input.nextInt();
		System.out.println("0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算");
		int flag = input.nextInt();
		int result = 0;
		String icon = "";
		switch (flag)
		{
		case 0:
			result = num1+num2;
			icon = "+";
			break;
		case 1:
			result = num1-num2;
			icon = "-";
			break;
		case 2:
			result = num1*num2;
			icon = "*";
			break;
		case 3:
			result = num1/num2;
			icon = "/";
			break;
		}
		System.out.println(num1+icon+num2+"="+result);

	}

}
