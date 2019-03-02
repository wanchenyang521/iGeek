package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午4:26:30   
 * @version V1.0 
 * @Description:两个数比较大小
 */
public class TestScannerEqual
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入两个数据：");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println((num1==num2)?"相同":"不相同");
	}

}
