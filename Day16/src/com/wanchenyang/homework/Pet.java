package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 16:02
 * @description
 **/
public abstract class Pet
{
   private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Pet()
    {
    }

    public Pet(String name)
    {
        this.name = name;
    }

    public abstract void eat();
}
