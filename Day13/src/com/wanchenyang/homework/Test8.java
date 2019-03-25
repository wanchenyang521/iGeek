package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:06
 * @description
 **/
public class Test8
{
    public static void main(String[] args)
    {
        Bear bear = new Bear("白色", 4);
        Panda panda = new Panda("黑色", 4);
        System.out.println(bear.getColor()+bear.getNumOfLegs()+"条腿的北极熊会");
        bear.eat();
        bear.catchFish();
        System.out.println(panda.getColor()+panda.getNumOfLegs()+"条腿的大熊猫会");
        panda.eat();
        panda.climbTree();


    }
}
