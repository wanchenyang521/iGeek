package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 16:11
 * @description
 **/
public class TestSwim
{
    public static void enter(Swimer swimer)
    {
        swimer.swim();
    }

    public static void main(String[] args)
    {
        enter(new Swimer()
        {
            @Override
            public void swim()
            {
                System.out.println("游啊游！！！！");
            }
        });
    }
}
