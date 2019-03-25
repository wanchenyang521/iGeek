package com.wanchenyang.homework;

import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 11:10
 * @description
 * i.    创建老虎对象 t,年龄赋值为2,腿的个数赋值为4;调用老虎对象t的eat()方法
 * ii.	创建啄木鸟对象 p,年龄赋值为1,腿的个数赋值为2;调用啄木鸟对象p的eat()方法
 * iii.	创建长颈鹿对象 g,年龄赋值为3,腿的个数赋值为4;调用长颈鹿对象g的eat()方法
 * iv.	创建兔子对象 r,年龄赋值为1,,腿的个数赋值为4;调用兔子对象r的eat()方法
 **/
public class Test6
{
    public static void main(String[] args)
    {
        Tiger tiger = new Tiger(4, 2);
        tiger.eat();
        Pecker pecker = new Pecker(2, 1);
        pecker.eat();
        Giraffe giraffe = new Giraffe(4, 2);
        giraffe.eat();
        Rabbit rabbit = new Rabbit(4, 1);
        rabbit.eat();
    }
}
