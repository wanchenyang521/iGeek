package com.wanchenyang.learn;
/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午3:25:53   
 * @version V1.0 
 * @Description:
 * 逻辑运算符 & | ^ ! && ||
 * &逻辑与，有false则为false
 * |逻辑或，有true则为true
 * ^逻辑异或，相同为false，不同为true
 * !逻辑非，非false则为true
 * 
 * 短路
 * && 左边是false 不执行
 * || 左边是true 不执行后面
 */
public class TestOperation4
{
	public static void main(String[] args)
	{
		boolean a = true;
		boolean b = false;

		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(!a);
		System.out.println(a^b);
		
		//短路
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at com.wanchenyang.learn.TestOperation4.main(TestOperation4.java:27)

//		int c = 3/0;
		
		boolean b3 = 1>2 && 2<(3/0);
		System.out.println(b3);
		
		boolean b4 = 1>2 || 2<(3/0);
		System.out.println(b4); //报错
		
		
		
	}
}
