package com.decorator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 10:33
 * @description
 * 2.具体组件
 **/
public class Coffee implements Drink
{
    String name = "雀巢";
    @Override
    public double cost()
    {
        return 10;
    }

    @Override
    public String info()
    {
        return name;
    }
}
