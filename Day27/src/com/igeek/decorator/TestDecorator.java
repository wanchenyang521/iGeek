package com.igeek.decorator;

/**
 * @author zx
 * @date 2019年4月15日
 * @version 1.0
 * @description:装饰模式
 * 1.抽象组件，需要装饰的抽象对象（接口或抽象父类）
 * 2.具体组件，需要装饰的对象
 * 3.抽象的装饰类
 * 4.具体的装饰类
 */
public class TestDecorator {

	public static void main(String[] args) {
		Drink coffee = new Coffee();
		Drink suger = new Suger(coffee);
		
		System.out.println(suger.info()+"--->"+suger.cost());
		
		Drink milk = new Milk(coffee);
		System.out.println(milk.info()+"--->"+milk.cost());
		
		milk = new Milk(suger);
		System.out.println(milk.info()+"--->"+milk.cost());
		

	}

}
