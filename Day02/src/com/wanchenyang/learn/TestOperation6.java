package com.wanchenyang.learn;
/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����4:05:08   
 * @version V1.0 
 * @Description:��Ԫ�����
 * ����ϵ���ʽ��?���ʽ1�����ʽ2
 * ����ϵ���ʽ��?���ʽ1������ϵ���ʽ2��?���ʽ2�����ʽ3
 */
public class TestOperation6
{
	public static void main(String[] args)
	{
		int x=3,y=4,z;
		z = (x>y)?x:y;
		System.out.println(z);
		if(x>y)
		{
			System.out.println(x);
		}
		else 
		{
			System.out.println(y);			
		}
		int x1 = -100;
		System.out.println(x1 > 0 ? 1:(x1 == 0?0:-1));
		
	}
}
