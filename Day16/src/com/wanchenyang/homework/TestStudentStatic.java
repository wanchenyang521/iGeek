package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 11:22
 * @description
 **/
public class TestStudentStatic
{
    static
    {
        System.out.println("Test 类的静态代码块");
    }

    public static void main(String[] args)
    {
        System.out.println("执行main方法");
//		创建学生对象
        StudentStatic s1 = new StudentStatic("main");
    }

}
