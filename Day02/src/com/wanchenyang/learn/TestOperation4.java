package com.wanchenyang.learn;
/**
 * 
 * @author: ����
 * @date:   2019��2��28�� ����3:25:53   
 * @version V1.0 
 * @Description:
 * �߼������ & | ^ ! && ||
 * &�߼��룬��false��Ϊfalse
 * |�߼�����true��Ϊtrue
 * ^�߼������ͬΪfalse����ͬΪtrue
 * !�߼��ǣ���false��Ϊtrue
 * 
 * ��·
 * && �����false ��ִ��
 * || �����true ��ִ�к���
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
		
		//��·
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at com.wanchenyang.learn.TestOperation4.main(TestOperation4.java:27)

//		int c = 3/0;
		
		boolean b3 = 1>2 && 2<(3/0);
		System.out.println(b3);
		
		boolean b4 = 1>2 || 2<(3/0);
		System.out.println(b4); //����
		
		
		
	}
}
