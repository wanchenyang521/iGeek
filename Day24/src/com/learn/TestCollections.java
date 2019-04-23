package com.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 09:32
 * @description
 **/
public class TestCollections
{
    public static void main(String[] args)
    {
//        List<String> arrlist =new ArrayList<>();
//
//        for (int i = 0; i < 10; i++)
//        {
//            arrlist.add(String.valueOf(i));
//        }
//        System.out.println(arrlist);
//
//        System.out.println(" Collections.shuffle(arrlist)");
//        Collections.shuffle(arrlist);
//        System.out.println(arrlist);
//
//
//        System.out.println(" Collections.reverse(arrlist);");
//        Collections.reverse(arrlist);
//        System.out.println(arrlist);
        //验证二分法查找元素必须有序
        List<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(7);
        list.add(6);
        list.add(10);
        list.add(9);

        int binarySearch = Collections.binarySearch(list, 9);
        System.out.println(binarySearch);

        Collections.sort(list);
        System.out.println(list);

        int binarySearch2 = Collections.binarySearch(list, 9);
        System.out.println(binarySearch2);

    }
}
