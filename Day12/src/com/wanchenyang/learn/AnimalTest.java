package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-15 15:26
 * @description
 **/
public class AnimalTest
{
    public static void main(String[] args)
    {
        Cat bosiCat = new Cat();
        Cat baliCat = new Cat();
        Dog shapiDog = new Dog();
        Dog diandianDog = new Dog();

        bosiCat.cry();
        baliCat.jumpHeight = "100m";
        shapiDog.runLength = 100;
        diandianDog.cry();


    }
}
