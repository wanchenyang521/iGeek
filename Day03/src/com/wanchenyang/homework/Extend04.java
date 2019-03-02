package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年3月1日 下午4:48:54   
 * @version V1.0 
 * @Description:
 * 根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
 */
public class Extend04
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入工龄");
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
			System.out.println("输入非法");
		}
		else 
		{
			System.out.println("您目前工作了"+workAge+"年，基本工资为 3000元, 应涨工资"
		+money+"元,涨后工资 "+(3000+money)+"元");
		}
			
		
		
	}

}
