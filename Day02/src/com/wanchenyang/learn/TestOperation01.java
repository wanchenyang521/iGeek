package com.wanchenyang.learn;

/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����2:33:38   
 * @version V1.0 
 * @Description:��������� 
 * ++ --
 * + - * / %��ģ��ȡ�ࣩ 
 * 
 * �������㣺
 * 1.��������������һ��Long,���ҲΪLong
 * 2.��������������һ��double,���ҲΪdouble
 * 
 */
public class TestOperation01
{
	public static void main(String[] args)
	{
		byte num1 = 1;
		int num2 = 2;
//		byte num3 = num1 + num2 ;
		int num3 = num1 + num2 ;
		
		long num4 = 3;
		long num5 = num4 + num3;
		
		float num6 = 3.14F;
		double num7 = num6+6.28;
		
		float num8 = 3.14F;
		
		float num9 = num6+num8;
		
		System.out.println(7/3);
		System.out.println(7%3);
		System.out.println(7%-3);
		System.out.println(-7%3);
		System.out.println(-7%-3);
		
		int a = 2;
		int a1 = a++;
		System.out.println("a:"+a);
		System.out.println("a1:"+a1);
		
		int b = 3;
		int b1 = ++b;
		System.out.println("b:"+b);
		System.out.println("b1:"+b1);
		
		int c = 3;
		++c;
		c++;
		System.out.println(c);
		
		
		
		
		
		
	}
}
