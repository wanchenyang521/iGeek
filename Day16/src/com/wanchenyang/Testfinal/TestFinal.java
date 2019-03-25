package com.wanchenyang.Testfinal;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 09:37
 * @description
 * 1.final修饰的变量无法在赋值
 * 2.final修饰的类无法被继承
 * 3.final修饰的方法无法被重写
 **/
public class TestFinal
{
    final int a = 7;
    public static void main(String[] args)
    {

    }
}

class Animal
//final class Animal
//Cannot inherit from final 'com.wanchenyang.Testfinal.Animal'
{
    public void shout()
    {
        System.out.println("animal shout");
    }

    public final void eat()
    {
        System.out.println("animal eat");
    }
}

class Dog extends Animal
{
    @Override
    public void shout()
    {
        System.out.println("dog wowowo");
    }
//




}