package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����7:13:07   
 * @version V1.0 
 * @Description:����¼��һ�������εĳ��Ϳ�(���Ϳ�Ϊint����)
 * ���㳤���ε�������ܳ�
 */
public class Test05
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("��������εĳ�");
		int length = input.nextInt();
		System.out.println("��������εĿ�");
		int width = input.nextInt();
//		���
		int area = length * width;
//		�ܳ�
		int perimeter = (length+width)*2;
		System.out.println("���:"+area+"\n�ܳ�:"+perimeter);

	}

}
