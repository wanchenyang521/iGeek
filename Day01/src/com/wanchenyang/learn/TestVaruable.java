package com.wanchenyang.learn;
/**
 * 
 * @Description: ����
 * @author: ����
 * @date:   2019��2��27�� ����3:49:37   
 * @version V1.0
 */
public class TestVaruable
{
	/*
	 * �������ֲ�������
	 * 1.�ֲ�������ʹ��ʱ��ʼ��
	 * 2.�������ڣ�������λ�õ�������������ִ�н���Ϊֹ
	 * 
	 * ��������Ա������
	 * ���ڲ�����ı������������
	 * ��Ĭ�ϳ�ʼ��
	 *�������ڣ������Ŷ���
	 *
	 *��������̬������
	 *1.�������ڣ���������
	 * 
	 * */
	static int size; //��̬����
	
//	��������Ա������
	int salary;
	public static void main(String[] args)
	{
		{
			int age = 10;
		}
//		�������ֲ�������
		int i = 20;
		int j = i+5;
		System.out.println(j);
//		System.out.println(age);
		TestVaruable temp = new TestVaruable();
		System.out.println(temp.salary);
		System.out.println(size);
		System.out.println(TestVaruable.size);
		
	}
}
