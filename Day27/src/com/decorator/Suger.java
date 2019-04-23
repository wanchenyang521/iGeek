package com.decorator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 10:43
 * @description
 * 4.具体的装饰类
 **/
public class Suger extends Decorator
{
    public Suger(Drink drink)
    {
        super(drink);
    }

    @Override
    public double cost()
    {
        return super.cost()*2;
    }

    @Override
    public String info()
    {
        return super.info()+"加糖";
    }
}
