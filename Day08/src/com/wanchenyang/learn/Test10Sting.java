package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 15:34
 * @description
 **/
public class Test10Sting
{
    public static void main(String[] args)
    {
        int[] num = {1,2,3,4};
        System.out.println(arrayToString(num));
    }
    public static String arrayToString(int[] num)
    {
        String s ="[";
        for (int i = 0; i < num.length; i++)
        {
            if(i==num.length-1)
            {
                s+=num[i]+"]";
            }
            else
            {
                s+=num[i]+",";
            }
        }
        return s;
    }
}
