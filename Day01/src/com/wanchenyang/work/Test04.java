package com.wanchenyang.work;

import java.util.Scanner;

/**
 * 
 * @Description:��ӡ����
 * @author: ����
 * @date:   2019��2��28�� ����8:47:31   
 * @version V1.0
 */
public class Test04
{
	public static void main(String[] args)
	{
//		�ֶ�������Ҫ������ż��
//		Scanner input = new Scanner(System.in);
//		System.out.println("���������");
//		int nums= input.nextInt(); 

		
		int level = 4;  //�ϲ�������
//		��ӡ�ϲ���
		for(int i = 1;i <= level; i++) 
		{
//			ǰ���ֿո�
			for(int j = 1 ;j<=level-i;j++) 
			{
				System.out.print(" ");
			}		
			for(int m = 1;m <= 2*i-1; m++) 
			{
//				��ӡ*
				if(m==1 || m == 2*i-1) 
				{
					System.out.print("*");
				}
//				��ӡ���Ĳ���
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
//		��ӡ�²������ϲ����෴
		for(int i = level-1;i >= 1; i--) 
		{
//			ǰ���ֿո�
			for(int j =level-i ;j>=1;j--) 
			{
				System.out.print(" ");
			}		
			for(int m = 2*i-1;m >=1 ; m--) 
			{
//				��ӡ*
				if(m==1 || m == 2*i-1) 
				{
					System.out.print("*");
				}
//				��ӡ���Ĳ���
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	
	}
}
