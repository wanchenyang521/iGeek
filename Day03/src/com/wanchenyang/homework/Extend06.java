package com.wanchenyang.homework;
/**
 * 
 * @author: ����
 * @date:   2019��3��1�� ����7:01:08   
 * @version V1.0 
 * @Description:
 * 1.���������߶�Ϊ8848�ף���һ���㹻���ֽ�����Ϊ0.0001�ס�
 * 2.���ʣ����۵����ٴΣ������۳����������ĸ߶ȡ�
 */
public class Extend06
{

	public static void main(String[] args)
	{
		int sum = 0;
		double hight = 0.0001;
		while(true) 
		{
			hight = hight*2;
			sum++;
			if(hight>=8848) 
			{
				break;
			}
		}
		System.out.println("�߶�"+hight);
		System.out.println("����"+sum);

	}

}
