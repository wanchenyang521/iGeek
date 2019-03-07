package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 19:18
 * @description
 **/
public class Extend03MainApp
{
    public static void main(String[] args)
    {
        Extend03Cat cat = new Extend03Cat("花色", "波斯猫");
        cat.eat();
        cat.catchMouse();

        Extend03Dog dog = new Extend03Dog();
        dog.setColor("黑色");
        dog.setBreed("藏獒");

        dog.eat();
        dog.lookHome();



    }
}
