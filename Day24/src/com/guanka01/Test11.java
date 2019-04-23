package com.guanka01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 15:21
 * @description
 **/
public class Test11
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(33);
        arrayList.add(55);
        arrayList.add(77);
        Collections.shuffle(arrayList);
        for (Integer temp:
                arrayList)
        {
            System.out.println(temp);
        }
    }
}
