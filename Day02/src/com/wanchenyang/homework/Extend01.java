package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����7:23:30   
 * @version V1.0 
 * @Description:����¼������int���͵�����,����������������ֵ,������������ֵ
 */
public class Extend01
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("������num1");
		int num1 = input.nextInt();
		System.out.println("������num2");
		int num2 = input.nextInt();
		System.out.println("����ǰ\tnum1:"+num1+"\tnum2:"+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("������\tnum1:"+num1+"\tnum2:"+num2);
	}
}
