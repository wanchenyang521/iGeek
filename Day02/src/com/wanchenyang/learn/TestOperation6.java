package com.wanchenyang.learn;
/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午4:05:08   
 * @version V1.0 
 * @Description:三元运算符
 * （关系表达式）?表达式1：表达式2
 * （关系表达式）?表达式1：（关系表达式2）?表达式2：表达式3
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
