package com.wanchenyang.homework.level2_02;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 15:36
 * @description
 **/
public class Father
{
    public void eat() throws ToothPainException
    {
        System.out.println("吃到石子");
        throw new ToothPainException();
    }
    public void drink()
    {
        System.out.println("喝什么都没有问题");
    }
}
