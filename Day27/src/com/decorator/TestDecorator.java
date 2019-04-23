package com.decorator;

import java.util.Collections;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 10:17
 * @description
 * 装饰模式
 * 1.抽象组件，需要装饰的抽象对象（接口或抽象父类）
 * 2.具体组件，需要装饰的对象
 * 3.抽象的装饰类
 * 4.具体的装饰类
 **/
public class TestDecorator
{
    public static void main(String[] args)
    {
        Drink coffee = new Coffee();
        Drink suger = new Suger(coffee);
        System.out.println(suger.info()+"===>价格"+suger.cost());
        Drink milk = new Milk(coffee);
        System.out.println(milk.info()+"===>价格"+milk.cost());
        milk = new Milk(suger);
        System.out.println(milk.info()+"--->"+milk.cost());

    }
}
