package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午7:17:56   
 * @version V1.0 
 * @Description:定义int类型的变量a,定义int类型的变量b
 * 使用三元运算符判断如果a大于b返回a与b的和,否则返回a与b的乘积,打印结果
 */
public class Test06
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入a");
		int a = input.nextInt();
		System.out.println("请输入b");
		int b = input.nextInt();
		int result = (a>b)?(a+b):(a*b);
		System.out.println(result);
		

	}

}
