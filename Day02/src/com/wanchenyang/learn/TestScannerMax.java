package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����4:29:42   
 * @version V1.0 
 * @Description:�������Ƚϴ�С
 */
public class TestScannerMax
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�������������ݣ�");
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
