package com.wanchenyang.astract;

import javax.swing.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 10:11
 * @description
 **/
public class Test
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(10, 100);
//        Circle circle = new Circle(100);
        Shape shape = new Rectangle(10, 100);
        System.out.println(shape.getArea());
        System.out.println(rectangle.getArea());


    }
}
