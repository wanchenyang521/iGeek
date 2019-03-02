package com.wanchenyang.learn;
/**
 * 
 * @author: 晨阳
 * @date:   2019年3月1日 下午3:38:13   
 * @version V1.0 
 * @Description:
 */
public class TestBreak01
{
	public static void main(String[] args)
	{
		/**
		 * 死循环
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
		System.out.println("找到了");
		
		
	}

}
