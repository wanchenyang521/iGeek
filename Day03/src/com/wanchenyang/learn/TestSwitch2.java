package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年3月1日 上午10:07:16   
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
			System.out.println("元音");
			break;
		case 'y':
		case 'w':
			System.out.println("半元音");
			break;
		default:
			System.out.println("其他辅音");
			break;
		}
	}

}
