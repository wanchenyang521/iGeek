package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 20:34
 * @description 1.求1-500之内能同时被2，5，7整除的所有数及个数并5个一行打印
 * 2.求100以内能被3整除的数加上能被5整除的数的和
 **/
public class Extend04
{
    public static void main(String[] args)
    {
        System.out.println("求1-500之内能同时被2，5，7整除的所有数及个数并5个一行打印");
        printNum();
        System.out.println();
        System.out.println("求100以内能被3整除的数加上能被5整除的数的和");
        System.out.println(printSum());
    }


    //    求1-500之内能同时被2，5，7整除的所有数及个数并5个一行打印
    public static void printNum()
    {
        int count = 0;
        for (int i = 1; i <= 500; i++)
        {
            if (i % 2 == 0 && i % 5 == 0 && i % 7 == 0)
            {
                count++;
                if (count % 6 == 0)
                {
                    System.out.println();
                    count = 0;
                }
                System.out.print(i + " ");
            }
        }
    }

    //    求100以内能被3整除的数加上能被5整除的数的和
    public static int printSum()
    {
        int sum3 = 0;
        int sum5 = 0;
        for (int i = 1; i <= 100; i++)
        {
            if(i%3==0)
            {
                sum3+=i;
            }
            if(i%5==0)
            {
                sum5+=i;
            }
        }
        return sum3+sum5;
    }

}
