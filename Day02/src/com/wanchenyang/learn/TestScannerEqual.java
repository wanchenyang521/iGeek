package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����4:26:30   
 * @version V1.0 
 * @Description:�������Ƚϴ�С
 */
public class TestScannerEqual
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�������������ݣ�");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println((num1==num2)?"��ͬ":"����ͬ");
	}

}
