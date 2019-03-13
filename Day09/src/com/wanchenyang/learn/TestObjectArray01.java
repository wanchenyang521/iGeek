package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 08:42
 * @description
 **/
public class TestObjectArray01
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        int[] arr2 = new int[3];
//        创建对象数组
        Student[] students = new Student[3];
        students[0] = new Student("1602370122","万晨阳",20);
        students[1] = new Student("1602370123","万晨阳",21);
        Student wanchenyang = new Student("1602370124","wanchenyang",22);
        students[2] = wanchenyang;
        System.out.println(students[0].getAge());
        System.out.println(students[1]);
        for (int i = 0; i < students.length; i++)
        {
            System.out.println(students[i]);
        }

    }
}
