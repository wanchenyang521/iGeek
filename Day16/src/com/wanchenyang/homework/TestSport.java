package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 15:47
 * @description
 **/
public class TestSport
{
    public static void enter(Sport s)
    {
        s.run();
    }

    public static void main(String[] args)
    {
        enter(new Sport()
        {
            @Override
            public void run()
            {
                System.out.println("参加运动会,奔跑吧");
            }
        });
    }
}
