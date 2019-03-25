package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-20 20:26
 * @description
 **/
public class Test02
{
    public static void main(String[] args)
    {
        Phone phone = new Phone("iPhone");
        Person person = new Person("景甜", 18);
        System.out.print(person.getAge()+"岁的"+person.getName());
        person.usePhone(phone);
    }
}
