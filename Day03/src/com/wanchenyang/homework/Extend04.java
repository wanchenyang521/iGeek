package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����4:48:54   
 * @version V1.0 
 * @Description:
 * ���ݹ���(����)��Ա���ǹ���(����),����ͻ�������ͨ������¼��
 */
public class Extend04
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�����빤��");
		int workAge = input.nextInt();
		int money = 0;
		if(workAge>=10&&workAge<15) 
		{
			money = 5000;
		}
		else if(workAge>=5&&workAge<10)
		{
			money = 2500;
		}
		else if(workAge>=3&&workAge<5)
		{
			money = 1000;
		}
		else if(workAge>=1&&workAge<3)
		{
			money = 500;
		}
		else if(workAge>=0&&workAge<1)
		{
			money = 200;
		}
		else 
		{
			money = 0;
		}
		if(money==0) 
		{
			System.out.println("����Ƿ�");
		}
		else 
		{
			System.out.println("��Ŀǰ������"+workAge+"�꣬��������Ϊ 3000Ԫ, Ӧ�ǹ���"
		+money+"Ԫ,�Ǻ��� "+(3000+money)+"Ԫ");
		}
			
		
		
	}

}
