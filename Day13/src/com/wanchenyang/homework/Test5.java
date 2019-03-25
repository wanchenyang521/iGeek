package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 11:03
 * @description
 **/
public class Test5
{
    public static void main(String[] args)
    {
        Dog d = new Dog("黑色", 4);
        d.eat();
        d.lookHome();
        Parrot parrot = new Parrot("绿色", 2);
        parrot.eat();
        parrot.say();
    }
}
