package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午7:13:07   
 * @version V1.0 
 * @Description:键盘录入一个长方形的长和宽(长和宽为int类型)
 * 计算长方形的面积和周长
 */
public class Test05
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入矩形的长");
		int length = input.nextInt();
		System.out.println("请输入矩形的宽");
		int width = input.nextInt();
//		面积
		int area = length * width;
//		周长
		int perimeter = (length+width)*2;
		System.out.println("面积:"+area+"\n周长:"+perimeter);

	}

}
