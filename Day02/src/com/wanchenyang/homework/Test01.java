package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����6:55:50   
 * @version V1.0 
 * @Description:����¼��һ��int���͵�����,ʹ����Ԫ������ж����������������ż��
 */
public class Test01
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("���������ݣ�");
		int num = input.nextInt();
		String result = (num%2==0)?"ż��":"����";
		System.out.println(result);

	}

}
