package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 14:31
 * @description
 * 多态
 * 1.继承
 * 2.方法重写
 * 3.父类引用指向子类
 **/
public class TestPloy
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animalShout(animal);
        Dog dog = new Dog();
        animalShout(dog);
        Cat cat = new Cat();
        animalShout(cat);

        Animal d = new Dog();//向上造型
        ((Dog) d).sleep();//向下转型
    }



    public static void animalShout(Animal animal)
    {
        animal.shout();
    }

}
