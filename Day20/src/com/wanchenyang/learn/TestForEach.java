package com.wanchenyang.learn;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-29 09:32
 * @description
 **/
public class TestForEach
{
    public static void main(String[] args)
    {
        ArrayList<Person> personArrayList = new ArrayList<Person>();

        Person person1 = new Person("ww", 18);
        Person person2 = new Person("c", 19);
        Person person3 = new Person("y", 20);
        Person person4 = new Person("Q", 16);

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);

        for (Person person:
             personArrayList)
        {
            System.out.println(person);
        }
        System.out.println("----------");
        String[] strings = {"1","2","32"};
        for (String s:
             strings)
        {
            System.out.println(s);
        }

    }
}
