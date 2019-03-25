package com.wanchenyang.anonymous;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 15:35
 * @description
 * (new 类名（）
 * {
 *     方法名（参数列表）
 *     {
 *
 *     }
 * }).方法
 **/
public class TestAnnymous
{
    public static void main(String[] args)
    {
//        多态的使用
        Animal animal = new Dog();
        animal.eat();
        animal.sleep();
//        使用匿名类
        Animal animal1 = new Animal()
        {
            @Override
            public void eat()
            {
                System.out.println("wwwww");
            }

            @Override
            public void sleep()
            {
                System.out.println("ssssss");
            }
        };
        animal1.sleep();
        animal1.eat();

        (new Animal(){
            @Override
            public void eat()
            {
                System.out.println("匿名eat");
            }

            @Override
            public void sleep()
            {
                System.out.println("sleep");
            }
        }).eat();



    }
}
