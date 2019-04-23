package com.guanka01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 15:18
 * @description
 * ArrayList集合中有如下内容: {33,11,77,55},使用Collections.sort()对ArrayList集合中的数据进行排序,并打印出排序后的结果
 **/
public class Test10
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(33);
        arrayList.add(11);
        arrayList.add(77);
        arrayList.add(55);
        Collections.sort(arrayList);
        for (Integer temp:
             arrayList)
        {
            System.out.println(temp);
        }
    }
}
