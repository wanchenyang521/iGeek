package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-20 20:23
 * @description
 **/
public class Phone
{
    private String brand;
    private double price;

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public Phone(String brand, double price)
    {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public Phone()
    {
    }

    public Phone(String brand)
    {
        this.brand = brand;
    }

    public void playGame()
    {
        System.out.println("玩游戏");
    }

    public void call(String name)
    {
        System.out.println("给"+name+"打电话");
    }
}
