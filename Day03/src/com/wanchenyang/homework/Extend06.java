package com.wanchenyang.homework;
/**
 * 
 * @author: 晨阳
 * @date:   2019年3月1日 下午7:01:08   
 * @version V1.0 
 * @Description:
 * 1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
 * 2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
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
		System.out.println("高度"+hight);
		System.out.println("次数"+sum);

	}

}
