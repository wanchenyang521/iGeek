package com.wanchenyang.learn;

import javafx.beans.binding.When;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-29 09:00
 * @description
 **/
public class PersonTest
{
    public static void main(String[] args)
    {
        ArrayList<Person> personArrayList = new ArrayList<Person>();

        Person person1 = new Person("w", 18);
        Person person2 = new Person("c", 19);
        Person person3 = new Person("y", 20);
        Person person4 = new Person("Q", 16);
        Person person5 = new Person("WW", 90);

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);



//        获取迭代器
        Iterator<Person> personIterator = personArrayList.iterator();
//        遍历
        while (personIterator.hasNext())
        {
            Person person = personIterator.next();
//            ConcurrentModificationException 并发修改异常
            if (person.getAge()==16)
            {

                personArrayList.add(person5);
                break;
            }
            System.out.println(person);
        }
//        重新获取
//        获取迭代器
        Iterator<Person> personIterator2 = personArrayList.iterator();
//        遍历
        while (personIterator2.hasNext())
        {
            Person person = personIterator2.next();
            System.out.println(person);
        }





//        int sum=0;
//
//        Iterator<Person> personIterator = personArrayList.iterator();
//        while (personIterator.hasNext())
//        {
//            Person person = personIterator.next();
//            System.out.println(person);
//            sum+= person.getAge();
//        }
//        System.out.println("总年龄："+sum);

    }
}
