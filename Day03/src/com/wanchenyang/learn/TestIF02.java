package com.wanchenyang.learn;
/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����8:52:37   
 * @version V1.0 
 * @Description:
 */
public class TestIF02
{
	public static void main(String[] args)
	{
//		��ֵ���ڵ��� 0.0 ��С�� 1.0
//		double temp = Math.random();
//		System.out.println(temp*10+1);
//		
//		int h = (int)(6*(Math.random())+1);
//		System.out.println(h);
//		if(h<3) 
//		{
//			System.out.println("Min");
//		}
		
		//�������ӣ�����������֮�ʹ���15�����������
		//10-15 һ��
		//3-10��
		int sum = 0;
		for (int i = 0; i < 3; i++)
		{
			int temp = (int)(6*(Math.random())+1);
			sum+=temp;
			System.out.println(i+1+"��:"+temp);
		}
		System.out.println("������֮�ͣ�"+sum);
		if(sum>15) 
		{
			System.out.println("��������");
		}
		else if(sum>=10&&sum<=15) 
		{
			System.out.println("һ��");
		}
		else 
		{
			System.out.println("��");
		}
		
	}
}
