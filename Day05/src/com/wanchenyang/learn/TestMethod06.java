package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 09:51
 * @description
 * 水仙花数
 * 方法
 **/
public class TestMethod06
{
    public static void main(String[] args)
    {
        narcissisticNumber();

    }
    public static void narcissisticNumber()
    {
        int num1,num2,num3;
        for (int i = 100; i <1000 ; i++)
        {
            num1 = i%10;
            num2 = i/10%10;
            num3 = i/100%10;
            if(Math.pow(num1,3)+Math.pow(num2,3)+Math.pow(num3,3)==i)
            {
                System.out.println(i);
            }
        }
    }
}

