package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午6:55:50   
 * @version V1.0 
 * @Description:键盘录入一个int类型的数据,使用三元运算符判断这个数是奇数还是偶数
 */
public class Test01
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数据：");
		int num = input.nextInt();
		String result = (num%2==0)?"偶数":"奇数";
		System.out.println(result);

	}

}
