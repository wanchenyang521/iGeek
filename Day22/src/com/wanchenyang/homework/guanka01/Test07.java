package com.wanchenyang.homework.guanka01;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 20:23
 * @description
 **/
public class Test07
{
    public static void main(String[] args)
    {
        HashSet<Person> personHashSet = new HashSet<Person>();
        personHashSet.add(new Person("wcy",18));
        personHashSet.add(new Person("wcy1",18));
        personHashSet.add(new Person("wcy",18));
        personHashSet.add(new Person("wcy2",12));
        Iterator<Person> personIterator = personHashSet.iterator();
        while (personIterator.hasNext())
        {
            System.out.println(personIterator.next());
        }
    }
}
