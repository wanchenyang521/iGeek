package com.wanchenyang.homework.guanka02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 21:13
 * @description
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 * 使用迭代器把最终的结果输出到控制台
 **/
public class Test07
{
    public static void main(String[] args)
    {
//        1.	创建HashSet用于保存随机数
        HashSet<Integer> integerHashSet = new HashSet<Integer>();
//2.	创建Random用于产生随机数
        Random random = new Random();
//3.	使用while循环判断hs的size是否小于10
        while (integerHashSet.size()<10)
        {
            //4.	hs的size小于10就生成一个随机数
            int temp = random.nextInt(20)+1;
//5.	将随机数添加到HashSet,重复的随机数HashSet不会添加
            integerHashSet.add(temp);
        }
//6.	获取迭代器
        Iterator<Integer> integerIterator = integerHashSet.iterator();
//7.	使用迭代器循环判断是否有下一个元素
        while (integerIterator.hasNext())
        {
//8.	获取到下一个元素.打印出来
            System.out.println(integerIterator.next());
        }

    }
}
