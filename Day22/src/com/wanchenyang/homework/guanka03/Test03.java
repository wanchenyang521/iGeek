package com.wanchenyang.homework.guanka03;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 22:08
 * @description
 * 有一堆零件数量不超过1000个,
 * 如果4个零件一组最后剩余2个,
 * 如果7个零件一组最后剩余3个,
 * 如果9个零件一组最后剩余5个,
 * 请计算这堆零件个数有几种可能
 **/
public class Test03
{
    public static void main(String[] args)
    {
        int count = 0;
        for (int i = 0; i < 1000; i++)
        {
            if(i%4==2&&i%7==3&&i%9==5)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
