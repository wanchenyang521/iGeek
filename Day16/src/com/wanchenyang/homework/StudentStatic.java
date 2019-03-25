package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 11:22
 * @description
 **/
public class StudentStatic
{
    static {
        System.out.println("Student 类的静态代码块");
    }
    public StudentStatic(){
        System.out.println("Student 类的构造方法");
    }
    public StudentStatic(String methodName){
        System.out.println("在"+methodName+"方法中创建Student对象调用的");
    }

}
