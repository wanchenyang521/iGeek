package com.wanchenyang.interfaceExtends;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 10:42
 * @description
 **/
//public class Cylinder implements Face3
public class Cylinder2 implements Face1,Face4
{
    private double radius;
    private double height;

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public Cylinder2(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void volum()
    {
        System.out.println("体积" + getArea() * height);
    }

    @Override
    public double getArea()
    {
        return pi * radius * radius;
    }

    public static void main(String[] args)
    {
        Cylinder2 cylinder2 = new Cylinder2(3.0, 10);
        double result = cylinder2.getArea();
        System.out.println(result);
        cylinder2.volum();
    }
}
