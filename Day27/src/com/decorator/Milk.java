package com.decorator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 10:42
 * @description
 * 4.具体的装饰类
 **/
public class Milk extends Decorator
{
    public Milk(Drink drink)
    {
        super(drink);
    }

    @Override
    public double cost()
    {
        return super.cost()*3;
    }

    @Override
    public String info()
    {
        return super.info()+"加奶";
    }
}
