package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 09:07
 * @description
 **/
public class Submarine implements Swim
{

    @Override
    public void swim()
    {
        System.out.println("潜啊潜~~~~"+Swim.a);
    }
}
