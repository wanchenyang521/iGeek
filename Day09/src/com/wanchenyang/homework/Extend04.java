package com.wanchenyang.homework;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-12 08:19
 * @description
 **/
public class Extend04
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>()
        {
            {
                add(1);
                add(452);
                add(5245);
                add(23452);
                add(25);
                add(22);
                add(22);
                add(22220);
            };
        };

        reverse(list);
        System.out.println(list);
        System.out.println("最大值"+max(list));
        System.out.println("最小值"+min(list));
        System.out.println("下标"+indexOf(list, 452));
        replaceAll(list, 22, 220);
        System.out.println(list);

    }
//        参数ArrayList<Integer> list:要进行操作的集合对象
//        要求：对list集合对象中的元素进行反转
//        (第一个和最后一个交换，第二个和倒数第二个交换，第三个和倒数第三个交换...)
        public static void reverse(ArrayList<Integer> list)
        {
            for (int i = 0; i < list.size()/2; i++)
            {
                int temp = list.get(i);
                list.set(i, list.get(list.size()-i-1));
                list.set(list.size()-i-1, temp);
            }
        }
//        参数ArrayList<Integer> list:要进行操作的集合对象
//        要求：求出list集合对象中的最大值并返回
        public static Integer max(ArrayList<Integer> list)
        {
            int result = list.get(0);
            for (int i = 0; i < list.size(); i++)
            {
                if(result<list.get(i))
                {
                    result = list.get(i);
                }
            }
            return result;
        }
//        参数ArrayList<Integer> list:要进行操作的集合对象
//        要求：求出list集合对象中的最小值并返回
        public static Integer min(ArrayList<Integer> list)
        {
            int result = list.get(0);
            for (int i = 0; i < list.size(); i++)
            {
                if(result>list.get(i))
                {
                    result = list.get(i);
                }
            }
            return result;
        }
//        参数ArrayList<Integer> list:要进行操作的集合对象
//        参数Integer i:需要在集合中查找的元素
//        要求：求出元素i在list集合中第一次出现的索引，如果没有返回-1
        public static int indexOf(ArrayList<Integer> list,Integer i)
        {
            int index = -1;
            for (int j = 0; j < list.size(); j++)
            {
                if(i.equals(list.get(j)))
                {
                    index = j;
                    break;
                }
            }
            return index;
        }

//        参数ArrayList<Integer> list:要进行操作的集合对象
//        参数Integer oldValue:需要被替换掉的原值
//        参数Integer newValue：替换后的新值
//        要求：将list集合中的所有值为oldValue的元素替换为newValue
    public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue)
        {
            for (int i = 0; i < list.size(); i++)
            {
                if(list.get(i).equals(oldValue))
                {
                    list.set(i, newValue);
                }
            }
        }


}
