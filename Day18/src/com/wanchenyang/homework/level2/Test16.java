package com.wanchenyang.homework.level2;

import java.util.Arrays;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 15:22
 * @description
 **/
public class Test16
{
    public static void main(String[] args)
    {
        String str = "  anglebaby  女  18  515151511  ";
        str=str.trim();
        String[] strings = str.split("\\s+");
        System.out.println(Arrays.toString(strings));
        int age = Integer.parseInt(strings[2]);
        Student student = new Student(strings[0],strings[1],age,strings[3]);
        System.out.println(student.toString());
        if(student.getQq().matches("[1-9][0-9]{4,11}"))
        {
            System.out.println("合法");
        }

    }
}
