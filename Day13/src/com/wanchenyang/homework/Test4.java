package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 10:53
 * @description
 **/
public class Test4
{
    public static void main(String[] args)
    {
        Actor a = new Actor("景甜", "18");
        a.eat();
        a.dance();
        Singer singer = new Singer("薛之谦", "30");
        singer.eat();
        singer.dance();
    }
}
