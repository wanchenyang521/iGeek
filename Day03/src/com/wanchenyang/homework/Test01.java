package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����4:01:01   
 * @version V1.0 
 * @Description:
 * ����¼��ѧ�����Գɼ����ж�ѧ���ȼ�:
 * 90-100	����
 * 80-90	��
 * 70-80	��
 * 60-70	����
 * 60����	������
 */
public class Test01
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		int score = input.nextInt();
		if(score>=90&&score<=100) 
		{
			System.out.println("����");
		}
		else if(score>=80&&score<90) 
		{
			System.out.println("��");
		}
		else if(score>=70&&score<80) 
		{
			System.out.println("��");
		}
		else if(score>=60&&score<70) 
		{
			System.out.println("����");
		}
		else if(score>=0&&score<60) 
		{
			System.out.println("������");
		}
		else 
		{
			System.out.println("�Ƿ��ɼ�");
		}
		

	}

}






