package com.wanchenyang.learn;
/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����3:38:13   
 * @version V1.0 
 * @Description:
 */
public class TestBreak01
{
	public static void main(String[] args)
	{
		/**
		 * ��ѭ��
		 * for(;;){}
		 * while(true){}
		 */
		while(true) 
		{
			int i = (int)(100*Math.random());
			System.out.println(i);
			if(i==88) 
			{
				break;
			}
		}
		System.out.println("�ҵ���");
		
		
	}

}
