package com.wanchenyang.polymorphism;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 14:45
 * @description
 **/
public class SubClassTypeDemo
{
    public static void main(String[] args)
    {
        Animal animal = new Person();
        animal.sleep();
        animal.eat();
        System.out.println("=========");
        method(animal);
        System.out.println("==========");

        Person person = (Person) animal;
        person.study();
        person.work();
        System.out.println("=======");
        method(person);
        System.out.println("========");
        Animal animal1 = new Dog();
        animal1.eat();
        Dog dog = (Dog) animal1;
        dog.keepDoor();
        System.out.println("======");
        method(dog);
        System.out.println("======");

    }

    public static void method(Animal animal)
    {
        if(animal instanceof Dog)
        {
            Dog dog = (Dog)animal;
            dog.keepDoor();
        }
        if(animal instanceof Person)
        {
            Person person = (Person)animal;
            person.work();
            person.study();
        }
    }



}
