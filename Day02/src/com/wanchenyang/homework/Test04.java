package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午7:08:49   
 * @version V1.0 
 * @Description:定义一个int类型的变量,初始化值为123,
 * 求这个数的个位,十位,百位分别是多少
 * 输出结果:123的个位是3,十位是2,百位是1
 */
public class Test04
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = 123;
		int ones = num%10;
		int tens = num/10%10;
		int hundreds = num/100;
		System.out.println("123的个位是"+ones+",十位是"+tens+",百位是"+hundreds);

	}

}
