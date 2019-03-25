package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-20 20:35
 * @description
 **/
public class Test04
{
    public static void main(String[] args)
    {
        Person person = new Person("古力娜扎");
        System.out.print(new Person("古力娜扎").getName());
        new Person().readBook(new Book("择天记"));
    }
}
