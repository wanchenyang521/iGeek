package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午7:26:53   
 * @version V1.0 
 * @Description:A在B前面5km，A速度为1km/h，B速度为2km/h，求b多久能赶上a
 */
public class Extend02
{
	public static void main(String[] args)
	{
		int speedA = 1;
		int speedB = 2;
		int time = 1;
		while(true) 
		{
			if(speedB*time==speedA*time+5) 
			{
				break;
			}
			else 
			{
				time++;
			}
		}
		System.out.println("需要"+time+"h后B能赶上A!");
	}
}
