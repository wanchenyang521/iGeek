package com.wanchenyang.homework.guanka02;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 20:49
 * @description
 * 定义一个Student类, 包含名称, 年龄, 性别(姓名, 年龄, 性别完全相同视为同一学生)
 * 创建10个Student对象,至
 * 少有两个学生姓名,年龄,性别完全相同.
 * 把这10个学生添加到Set集合中,不可以重复,遍历Set集合打印学生信息,使用两种方式
 **/
public class Test04
{
    public static void main(String[] args)
    {
        HashSet<Student> studentHashSet = new HashSet<Student>();
        studentHashSet.add(new Student("10", 10));
        studentHashSet.add(new Student("11", 11));
        studentHashSet.add(new Student("12", 12));
        studentHashSet.add(new Student("12", 12));
        studentHashSet.add(new Student("14", 14));
        studentHashSet.add(new Student("15", 15));
        studentHashSet.add(new Student("15", 15));
        studentHashSet.add(new Student("17", 17));
        studentHashSet.add(new Student("18", 18));
        studentHashSet.add(new Student("19", 19));

        Iterator<Student> studentIterator = studentHashSet.iterator();
        while (studentIterator.hasNext())
        {
            System.out.println(studentIterator.next());
        }
        System.out.println("+++++++++++++");
        for (Student student:
             studentHashSet)
        {
            System.out.println(student);
        }

    }
}
