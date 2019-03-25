package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 11:31
 * @description
 * 验证:引用类型的变量值为对象地址值，地址值不能更改，但是地址内的对象属性值可以修改
 **/
public class Final_4
{
    public static void main(String[] args)
    {
       final Cat cat = new Cat();
//       cat = new Cat();引用类型的变量值为对象地址值，地址值不能更改
        cat.age = 2;
//        地址内的对象属性值可以修改

    }

}
class Cat
{
    public Cat()
    {
    }

    public Cat(int age)
    {
        this.age = age;
    }

    public int age;
}