package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����7:26:53   
 * @version V1.0 
 * @Description:A��Bǰ��5km��A�ٶ�Ϊ1km/h��B�ٶ�Ϊ2km/h����b����ܸ���a
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
		System.out.println("��Ҫ"+time+"h��B�ܸ���A!");
	}
}
