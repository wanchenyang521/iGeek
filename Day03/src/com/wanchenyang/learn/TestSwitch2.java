package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����10:07:16   
 * @version V1.0 
 * @Description:
 */
public class TestSwitch2
{
	public static void main(String[] args)
	{
		char a = 'a';
		int rand = (int) (26*(Math.random()));
		char temp  = (char) (a+rand);
		System.out.println(temp);
		switch (temp)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Ԫ��");
			break;
		case 'y':
		case 'w':
			System.out.println("��Ԫ��");
			break;
		default:
			System.out.println("��������");
			break;
		}
	}

}
