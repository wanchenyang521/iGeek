package com.decorator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 10:35
 * @description
 * 3.抽象的装饰类
 **/
public abstract class Decorator implements Drink
{
//    对抽象组件的引用
    private Drink drink;

    public Decorator(Drink drink)
    {
        super();
        this.drink = drink;
    }

    @Override
    public double cost()
    {
        return drink.cost();
    }

    @Override
    public String info()
    {
        return drink.info();
    }
}
