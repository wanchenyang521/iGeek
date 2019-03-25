package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-15 15:25
 * @description
 **/
public class Dog extends Animal
{
    public int runLength;

    @Override
    public void cry()
    {
//        super.cry();
        System.out.println("Dog wangwang~~~");
    }
}
