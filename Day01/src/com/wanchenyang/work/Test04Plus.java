package com.wanchenyang.work;

import java.util.Scanner;

/**
 * 
 * @Description: ��ӡ���Σ�����ֶ�����
 * @author: ����
 * @date:   2019��2��28�� ����9:38:35   
 * @version V2.0
 */
public class Test04Plus
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		while(true) 
		{
			System.out.println("���������,С�ڵ���0�˳�");
			int num= input.nextInt(); 
			int level = 0;  //�ϲ�������
			if(num<=0) 
			{
				break;
			}
			else 
			{
				//����
				if(num%2==1) 
				{
					level = num/2+1;
				}
				else 
				{
					System.out.println("�Ƿ����ݣ�����������������");
				}
			}

			
			
//			��ӡ�ϲ���
			for(int i = 1;i <= level; i++) 
			{
//				ǰ���ֿո�
				for(int j = 1 ;j<=level-i;j++) 
				{
					System.out.print(" ");
				}		
				for(int m = 1;m <= 2*i-1; m++) 
				{
//					��ӡ*
					if(m==1 || m == 2*i-1) 
					{
						System.out.print("*");
					}
//					��ӡ���Ĳ���
					else 
					{
						System.out.print(" ");
					}
				}
				System.out.println();
				
			}
//			��ӡ�²������ϲ����෴
			for(int i = level-1;i >= 1; i--) 
			{
//				ǰ���ֿո�
				for(int j =level-i ;j>=1;j--) 
				{
					System.out.print(" ");
				}		
				for(int m = 2*i-1;m >=1 ; m--) 
				{
//					��ӡ*
					if(m==1 || m == 2*i-1) 
					{
						System.out.print("*");
					}
//					��ӡ���Ĳ���
					else 
					{
						System.out.print(" ");
					}
				}
				System.out.println();
				
			}
		}
	
	}

}
