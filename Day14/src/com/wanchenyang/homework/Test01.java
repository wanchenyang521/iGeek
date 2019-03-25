package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-20 20:21
 * @description
 **/
public class Test01
{
    public static void main(String[] args)
    {
        Cat cat = new Cat("加菲", "棕色", 2);
        System.out.print(cat.getAge()+"岁的"+cat.getColor()+cat.getName()+"猫,在");
        cat.catchMouse();
    }
}
