package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 10:46
 * @description
 **/
public class Test3
{
    public static void main(String[] args)
    {
        Cock c = new Cock("红色", 2);
        c.eat();
        c.crow();
        Duck d = new Duck("黑色", 1);
        d.eat();
        d.swim();
    }
}
