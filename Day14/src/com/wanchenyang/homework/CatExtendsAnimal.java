package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 14:54
 * @description
 **/
public class CatExtendsAnimal extends Animal
{
    public void catchMouse()
    {
        System.out.println(color+"的"+name+"猫在抓老鼠");
    }

    public CatExtendsAnimal(String name, String color)
    {
        super(name, color);
    }

    public CatExtendsAnimal()
    {
    }
}
