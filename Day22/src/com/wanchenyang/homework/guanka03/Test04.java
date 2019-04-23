package com.wanchenyang.homework.guanka03;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 22:11
 * @description
 * 将50元兑换成5元,2元和1元.每种面额的钱不能为0张.共有几种兑换方法.每种兑换方法的钱是怎么样的?
 **/
public class Test04
{
    public static void main(String[] args)
    {
        int money = 50;
        int count1 = 1;
        int count2 = 2;
        int count5 = 5;
        int count=0;
        for (int i = 1; i <= 50; i++)
        {
            for (int j = 1; j <= 50 ; j++)
            {
                for (int k = 1; k <= 50 ; k++)
                {
                    if(count1*i+count2*j+count5*k==50)
                    {
                        System.out.println("count1:"+i+"count2:"+j+"count5:"+k);
                        count++;
                    }
                }
            }
        }
        System.out.println("总计："+count);
    }

}
