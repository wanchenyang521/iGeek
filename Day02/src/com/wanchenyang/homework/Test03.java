package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����7:03:23   
 * @version V1.0 
 * @Description:����¼���Լ�������(String),����(int),���(int)���浽��Ӧ�ı�����
 * ��������:�ҵ�����������,����25��,���180CM
 * (��ʾ������String����,��Ҫʹ��Scanner��next()����.)
 */
public class Test03
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("����������");
		String name = input.next();
		System.out.println("����������");
		int age = input.nextInt();
		System.out.println("���������");
		int height = input.nextInt();
		System.out.println("�ҵ�������"+name+",����"+age+"��,���"+height+"CM");
	}
}
