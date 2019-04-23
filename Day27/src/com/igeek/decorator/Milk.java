package com.igeek.decorator;

public class Milk extends Decorator{

	public Milk(Drink drink) {
		super(drink);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()*3;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info()+"加奶";
	}

}
