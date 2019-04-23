package com.wanchenyang.learn;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 10:04
 * @description
 * 提高程序的安全性
 * 将运行期问题转移到了编译期
 * 省去了类型强转的麻烦
 **/
public class GenericDemo02
{
    public static void main(String[] args)
    {
//        ArrayList<String> list = new ArrayList();
        ArrayList<Person> list = new ArrayList();
//        list.add("a");
//        list.add("a1");
//        list.add("a2");
//        list.add("a3");
        list.add(new Person("cc"));
        System.out.println(list.get(0).getName());
//        for (String string:
//             list)
//        {
//            System.out.println(string);
//        }
//        for (Object j :
//                list)
//        {
//            String name = (String) j;
//            System.out.println(name);
//        }


    }
}
