package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����7:17:56   
 * @version V1.0 
 * @Description:����int���͵ı���a,����int���͵ı���b
 * ʹ����Ԫ������ж����a����b����a��b�ĺ�,���򷵻�a��b�ĳ˻�,��ӡ���
 */
public class Test06
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("������a");
		int a = input.nextInt();
		System.out.println("������b");
		int b = input.nextInt();
		int result = (a>b)?(a+b):(a*b);
		System.out.println(result);
		

	}

}
