package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 16:04
 * @description
 **/
public class TestPet
{
    public static void print(Pet pet)
    {
        System.out.print(pet.getName());
        pet.eat();
    }
    public static void main(String[] args)
    {
        Pet pet = new Pet()
        {
            @Override
            public void eat()
            {
                System.out.println("吃鱼");
            }
        };
        pet.setName("tom");
        Pet pet2 = new Pet()
        {
            @Override
            public void eat()
            {
                System.out.println("啃骨头");
            }
        };
        pet2.setName("小黑");


        print(pet);
        print(pet2);
    }
}
