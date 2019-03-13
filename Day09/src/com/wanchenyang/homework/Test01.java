package com.wanchenyang.homework;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 16:56
 * @description
 * 1.    定义一个只能存储字符串的集合对象；
 * 2.	向集合内添加以下数据：
 * 	“孙悟空”
 * 	“猪八戒”
 * 	“沙和尚”
 * 	“铁扇公主”
 * 3.	不用遍历，直接打印集合；
 * 4.	获取第4个元素（注意，是--第4个元素，它的索引是？）
 * 5.	打印一下集合大小；
 * 6.	删除元素“铁扇公主”
 * 7.	删除第3个元素（注意：是--第3个元素）
 * 8.	将元素“猪八戒”改为“猪悟能”
 * 9.	再次打印集合；
 **/
public class Test01
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("孙悟空");
        arrayList.add("猪八戒");
        arrayList.add("沙和尚");
        arrayList.add("铁扇公主");
        System.out.println(arrayList);
        System.out.println(arrayList.get(3));
        arrayList.remove(3);
        arrayList.remove(2);
        arrayList.set(1, "猪悟能");
        System.out.println(arrayList);
    }
}
