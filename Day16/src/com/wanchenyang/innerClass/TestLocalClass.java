package com.wanchenyang.innerClass;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 14:40
 * @description
 * 定义在局部位置的局部类
 *
 * public class Outer
 * {
 *     public void method()
 *     {
 *         class Inner
 *         {
 *
 *         }
 *     }
 * }
 **/
public class TestLocalClass
{

    private String name = "wcy";


    public void method()
    {
//        局部位置的内部类
        class InnerClass
        {
            public void innerMethod()
            {
                System.out.println("内部类的方法被调用");
                System.out.println("外部类的成员"+name);
            }
        }

        InnerClass innerClass = new InnerClass();
        innerClass.innerMethod();

    }






}
