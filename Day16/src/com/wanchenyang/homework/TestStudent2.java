package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 15:58
 * @description
 **/
public class TestStudent2
{
    //	实例(对象)成员变量
    Student2 s = new Student2("成员变量显式初始化的时候");
    //	静态代码块
    static {
        System.out.println("Test 类的静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("main方法");
//		创建学生对象
        Student2 s1 = new Student2("main方法中");
//		创建Test对象
        TestStudent2 t = new TestStudent2();
    }

}
