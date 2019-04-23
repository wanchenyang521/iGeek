package com.igeek.decorator;

//具体组件
public class Coffee implements Drink {
	String name = "雀巢咖啡";

	@Override
	public double cost() {
		return 10;
	}

	@Override
	public String info() {
		return name;
	}

}
