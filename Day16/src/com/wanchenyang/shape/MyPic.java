package com.wanchenyang.shape;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 16:23
 * @description
 **/
public class MyPic
{
    public static void main(String[] args)
    {
        Picture picture = new Picture(520, 500);
        Circle c1 = new Circle(320,40,80);
        Rectangle r1 = new Rectangle(100, 100, 100, 100);
        Triangle t1 = new Triangle(100, 100, 200, 100, 150, 50);
        Line l1 = new Line(0,205,400,205);
        Circle c2 = new Circle(200,200,50);
        picture.add(c1);
        picture.add(r1);
        picture.add(t1);
        picture.add(l1);
        picture.add(c2);
    }
}
