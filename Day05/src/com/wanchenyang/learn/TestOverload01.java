package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 10:03
 * @description
 * 方法重载
 * 一.方法名一定要相同。
 * 二.方法的参数表必须不同，包括参数的类型或个数，以此区分不同的方法体。
 * 1.如果参数个数不同，就不管它的参数类型了！
 * 2.如果参数个数相同，那么参数的类型必须不同。
 * 三.方法的返回类型、修饰符可以相同，也可不同。
 *
 **/
public class TestOverload01
{
    public static void main(String[] args)
    {

    }
//    方法重载
    void add() {}
    void add(int a,int b){}
    void add(double a,double b){}
//    返回值类型不同的，也不能构成重载
//    int add(double a,double b){}

//    只有参数名称不同， 是不构成方法重载的
//    void add(double c,double d){}
    int add(int a,double b)
    {
        return a+(int)b;
    }
}
