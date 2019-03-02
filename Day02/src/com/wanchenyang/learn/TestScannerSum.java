package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午4:21:02   
 * @version V1.0 
 * @Description:键盘录入两个数据求和
 */
public class TestScannerSum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入两个数据：");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("求和："+(num1+num2));
	}

}
