package com.wanchenyang.astract;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 10:07
 * @description
 **/
public class Rectangle implements Shape
{
    double width;
    double length;

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public Rectangle()
    {
    }

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea()
    {
        return width*length;
    }

    @Override
    public double getLength()
    {
        return 2*(width+length);
    }
}
