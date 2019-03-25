package com.wanchenyang.innerClass;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 14:05
 * @description
 * 内部类
 *
 * public class Outer
 * {
 *     class Inner
 *     {
 *
 *     }
 * }
 *
 * Outer.Inner x=  new Outer().new Inner();
 **/
public class NestClass
{
    private String name = "cc";
//    成员内部类
    public class InnerClass
    {
        public void innerMethod()
        {
            System.out.println("InnerClass的innerMethod");
            System.out.println("InnerClass的变量"+name);
        }
    }

}
