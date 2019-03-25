package com.wanchenyang.Testfinal;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 09:47
 * @description
 **/
public class FinalDemo
{
//    静态常量
    public static final double PI = 3.1415926;

    public static void main(String[] args)
    {
        int a = 10;
        a = 9;
//        final修饰的变量无法赋值
        final int b = 20;
//        Cannot assign a value to final variable 'b'
//        b = 202;
        double r = 5;
        double area = r*r*FinalDemo.PI;
        System.out.println(area);

        final Person p = new Person();
        p.setName("wcy");
        System.out.println(p.getName());
//        为引用变量二次赋值，指p这个变量只能指向一个地址。不能指向第二个地址
//        Cannot assign a value to final variable 'b'
//        p = new Person();


    }
}
