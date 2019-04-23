package com.guanka02;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 15:39
 * @description
 **/
public class Test03
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(33);
        arrayList.add(55);
        arrayList.add(77);
        Object[] objectsArr = arrayList.toArray();
        System.out.println(Arrays.toString(objectsArr));
        Integer[] intArr = new Integer[arrayList.size()];
        Integer[] returnArr = arrayList.toArray(intArr);
        System.out.println(Arrays.toString(returnArr));



    }
}
