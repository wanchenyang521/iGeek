package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 15:58
 * @description
 **/
public class Student2
{
    static {
        System.out.println("Student 类的静态代码块");
    }
    public Student2(){
        System.out.println("Student 类的构造方法");
    }
    public Student2(String methodName){
        System.out.println("在"+methodName+"创建Student对象调用的");
    }

}
