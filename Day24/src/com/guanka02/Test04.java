package com.guanka02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 15:48
 * @description
 * 研发部门有5个人，
 * 信息如下：（姓名-工资）【柳岩=2100, 张亮=1700, 诸葛亮=1800, 灭绝师太=2600, 东方不败=3800】
 * ,将以上员工的相关信息存放在适合的集合中,给柳岩涨工资300,迭代出每个元素的内容输出到控制台
 **/
public class Test04
{
    public static void main(String[] args)
    {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("柳岩","2100");
        hashMap.put("张亮","1700");
        hashMap.put("诸葛亮","1800");
        hashMap.put("灭绝师太","2600");
        hashMap.put("东方不败","3800");

        String money = hashMap.get("柳岩");
        Integer tempMoney = Integer.valueOf(money)+300;
        hashMap.put("柳岩", String.valueOf(tempMoney));

        Set<String> stringSet = hashMap.keySet();
        for (String thisSet:
             stringSet)
        {
            System.out.println(thisSet+":"+hashMap.get(thisSet));
        }

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext())
        {
            String key = iterator.next();
            String value = hashMap.get(key);
            System.out.println(key+":"+value);
        }
    }
}
