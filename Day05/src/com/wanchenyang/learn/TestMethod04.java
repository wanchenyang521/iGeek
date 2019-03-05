package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 09:36
 * @description
 **/
public class TestMethod04
{
    public static void main(String[] args)
    {

    }
    public static int getMax(int num1,int num2,int num3)
    {
        return ((num1>num2)?num1:num2)>num3?((num1>num2)?num1:num2):num3;
//        if(num1>num2)
//        {
//            if(num1>num3)
//            {
//                return num1;
//            }
//            else
//            {
//                return num3;
//            }
//        }
//        else
//            {
//                if(num2>num3)
//                {
//                    return num2;
//                }
//                else
//                    {
//                        return num3;
//                    }
//            }
    }
}
