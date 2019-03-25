package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 15:08
 * @description
 **/
public class Clothes
{
    private String band;
    private String color;

    public String getBand()
    {
        return band;
    }

    public void setBand(String band)
    {
        this.band = band;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Clothes()
    {
    }

    public Clothes(String band, String color)
    {
        this.band = band;
        this.color = color;
    }
}
