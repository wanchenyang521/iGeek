package com.wanchenyang.learn;
/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����9:57:21   
 * @version V1.0 
 * @Description:
 */
public class TestIfElseifElse
{
	public static void main(String[] args)
	{
		int age = (int) (100*Math.random());
		System.out.println(age);
		if(age<15) 
		{
			System.out.println("��ͯ");
		}
		else if(age<30) 
		{
			System.out.println("����");
		}
		else if(age<50) 
		{
			System.out.println("����");
		}
		else if(age<65) 
		{
			System.out.println("������");
		}
		else
		{
			System.out.println("����");
		}
	}
}
