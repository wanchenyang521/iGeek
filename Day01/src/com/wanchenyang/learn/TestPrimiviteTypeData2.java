package com.wanchenyang.learn;

import java.math.BigDecimal;

/**
 * 
 * @Description:浮点型 默认double
 * @author: 晨阳
 * @date:   2019年2月27日 下午4:33:47   
 * @version V1.0
 */
public class TestPrimiviteTypeData2
{

	public static void main(String[] args)
	{
		float num1 = 3.14F;
		double num2 = 6.28;
		double num3 = 6.28E-2;
		double num4 = 6.28E5;
		System.out.println(num3);
		System.out.println(num4);
		
//		不精确
		float f = 0.1f;
		double d = 1.0/10;
		System.out.println(f==d);
		
		float d1 = 1321131212f;
		float d2 = d1+1;
		if(d1==d2) 
		{
			System.out.println("d1==d2");
		}
		else 
		{
			System.out.println("d1!=d2");
		}
		
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
		BigDecimal bd1 = BigDecimal.valueOf(0.1);
		BigDecimal bd2 = BigDecimal.valueOf(1.0/10);
		System.out.println(bd1.equals(bd2));
		
		

	}

}
