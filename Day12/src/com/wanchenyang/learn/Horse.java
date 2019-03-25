package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-15 14:49
 * @description
 * 方法的重写
 * 字类的返回值类型 小于等于父类
 **/
public class Horse extends Vehicle
{
    @Override
    public void run()
    {
        super.run();
        System.out.println("马儿跑");
    }

    @Override
    public Person passenger()
    {
        return new Student();
    }

//
//    @Override
//    public Person passenger()
//    {
////        字类的返回值类型 小于等于父类 报错
//        return new Object();
//    }
}
