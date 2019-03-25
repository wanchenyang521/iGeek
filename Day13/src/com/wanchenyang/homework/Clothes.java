package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 11:15
 * @description
 **/
public class Clothes
{
    private String color;
    private String brand;

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public Clothes()
    {
    }

    public Clothes(String color, String brand)
    {
        this.color = color;
        this.brand = brand;
    }
}
