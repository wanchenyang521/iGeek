package com.wanchenyang.learn;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 10:00
 * @description
 **/
public class GenericDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> listB = new ArrayList<String>();
        listB.add("a");
        listB.add("a1");
        listB.add("a2");
        listB.add("a3");
        ArrayList<Object> listA = new ArrayList<Object>(listB);
        listA.add("aa");
        System.out.println(listA);

    }
}
