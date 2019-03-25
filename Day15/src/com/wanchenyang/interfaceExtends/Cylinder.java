package com.wanchenyang.interfaceExtends;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 10:42
 * @description
 **/
//public class Cylinder implements Face3
public class Cylinder implements Face1,Face2,Face3
{
    private double radius;
    private double height;
    private String color;

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

    public String getColor()
    {
        return color;
    }

    public Cylinder()
    {
    }

    public Cylinder(double radius, double height, String color)
    {
        this.radius = radius;
        this.height = height;
        this.color = color;
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

    @Override
    public void setColor(String color)
    {
        this.color = color;
        System.out.println("颜色：" + this.color);
    }

    public static void main(String[] args)
    {
        Cylinder cylinder = new Cylinder(3.0, 10, "yellow");
        double result = cylinder.getArea();
        System.out.println(result);
        cylinder.volum();
        cylinder.setColor("yellow");
    }
}
