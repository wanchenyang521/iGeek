package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����5:00:11   
 * @version V1.0 
 * @Description:ģ����������ܣ�
 * �Լ���¼�������int���͵����ݽ��мӡ������ˡ��������㣬����ӡ������
 * ����¼����������,����ǰ������������μ����������
 * ����������ΪҪ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������)
 */
public class Extend05
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������");
		int num1 = input.nextInt();
		System.out.println("������ڶ�������");
		int num2 = input.nextInt();
		System.out.println("0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������");
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
