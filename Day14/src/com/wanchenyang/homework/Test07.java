package com.wanchenyang.homework;

import java.util.Date;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 14:56
 * @description
 **/
public class Test07
{
    public static void main(String[] args)
    {
        CatExtendsAnimal cat = new CatExtendsAnimal();
        cat.name = "Tom";
        cat.color = "棕色";
        cat.eat();
        cat.catchMouse();
        Dog dog = new Dog();
        dog.name = "Jerry";
        dog.color="白色";
        dog.eat();
        dog.lookHome();
    }
}
