package com.wanchenyang.astract;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 09:59
 * @description
 **/
public class Circle implements Shape
{
    double radius;

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return pi*radius*radius;
    }

    @Override
    public double getLength()
    {
        return 2*pi*radius;
    }
}
