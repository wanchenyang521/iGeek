package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����7:08:49   
 * @version V1.0 
 * @Description:����һ��int���͵ı���,��ʼ��ֵΪ123,
 * ��������ĸ�λ,ʮλ,��λ�ֱ��Ƕ���
 * ������:123�ĸ�λ��3,ʮλ��2,��λ��1
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
		System.out.println("123�ĸ�λ��"+ones+",ʮλ��"+tens+",��λ��"+hundreds);

	}

}
