package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����10:07:16   
 * @version V1.0 
 * @Description:
 */
public class TestSwitch
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please input number 1-7:");
		int day = input.nextInt();
		switch (day)
		{
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("����Ƿ�");
			break;
		}
	}

}
