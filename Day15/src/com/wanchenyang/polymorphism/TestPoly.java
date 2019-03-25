package com.wanchenyang.polymorphism;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 14:14
 * @description
 **/
public class TestPoly
{
    public static void main(String[] args)
    {
//       Person person = new Person();
//       person.eat();
//       person.sleep();
//       person.study();
//       person.work();
//       System.out.println("=====");
//        向上转型
        Animal animal = new Person();
        animal.eat();
        animal.sleep();
//        向下转型父类转子类
        Person person1 = (Person) animal;
        person1.study();
        person1.work();
//        Animal animal = new Person();
//        Person person = new Person();
//        feed(animal);
//        feed(person);

        Animal animal1 = new Dog();
        animal1.eat();
//        类型转换异常
//        此时animal1 认为是 Animal，认为将其转换为Person （实际上是Dog）
//        编译不会报错，运行的时候会报错
//        在进行强制转换时候，必须是什么对象转成什么类型
//        Person person = (Person)animal1;
//        person.eat();



    }

    public static void feed(Animal animal)
    {
        System.out.println("feed调");
        animal.eat();
    }


}
