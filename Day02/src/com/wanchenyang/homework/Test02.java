package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����6:59:32   
 * @version V1.0 
 * @Description:����¼��һ��ѧ���ɼ�(int����)
 * 				����ɼ����ڵ���60���������,����ɼ�С��60�����������
 */
public class Test02
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("������ɼ���");
		int score = input.nextInt();
		String result = (score>=60)?"����":"������";
		System.out.println(result);

	}

}
