package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����4:31:27   
 * @version V1.0 
 * @Description:
 * 1.�Ӽ�����¼��һ��1��5������;
 * 2.������Ϊ1ʱ��ӡ�˵�"�½�";
 * ������Ϊ2ʱ��ӡ�˵�"���ļ�";
 * ������Ϊ3ʱ��ӡ�˵�"����";
 * ������Ϊ4ʱ��ӡ�˵�"ˢ��";
 * ������Ϊ5ʱ��ӡ�˵�"�˳�",���˳�����;
 * ���д��������ֹjava��������: System.exit(0);
 */
public class Test05
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("������1-5,1:�½� 2:���ļ� 3:���� 4:ˢ�� 5:�˳�");
		int choice = input.nextInt();
		while(true) 
		{
			switch (choice)
			{
			case 1:
				System.out.println("�½�");
				break;
			case 2:
				System.out.println("���ļ�");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("ˢ��");
				break;
			case 5:
				System.out.println("�˳�");
				System.exit(0);
				break;

			default:
				System.out.println("����Ƿ�");
				break;
			}
			System.out.println("������1-5");
			choice = input.nextInt();
		}


	}

}
