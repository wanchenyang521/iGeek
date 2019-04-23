package com.guanka01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 15:22
 * @description
 **/
public class Test13
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(33);
        arrayList.add(55);
        arrayList.add(77);
        System.out.println(Collections.binarySearch(arrayList, 33));
        Collections.reverse(arrayList);
        System.out.println(Collections.binarySearch(arrayList, 33));

    }
}
