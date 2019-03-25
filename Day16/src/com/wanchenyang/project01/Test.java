package com.wanchenyang.project01;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 09:14
 * @description
 **/
public class Test
{
    public static void main(String[] args)
    {
        Chinese chinese = new Chinese("晨阳", 18, "学生");
        System.out.println(chinese.getAge()+chinese.getName()+chinese.getProfession()+Chinese.nationality);
        Chinese.nationality = "china";
        System.out.println(chinese.getAge()+chinese.getName()+chinese.getProfession()+Chinese.nationality);
    }
}
