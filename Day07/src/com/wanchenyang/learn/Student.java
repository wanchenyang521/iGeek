package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 09:07
 * @description
 * 类的定义
 * 对象和类的关系
 * 类是规范，根据类的定义来创建对象
 * 对象是类的一个具体实例，对象创建的过程就是new的过程
 *
 *万物皆对象
 * 程序就是一堆互相发消息的对象
 * 每个对象都有自己的一个类型
 * 所有某个特定类型的对象都可以提供相同的服务
 **/
public class Student
{
    int id;
    String name;
    String sex;
    int age;
    String address;

    public void study()
    {
        System.out.println("学习，学个屁！！！");
    }

    void eat()
    {

    }

    void sleep()
    {

    }


}
