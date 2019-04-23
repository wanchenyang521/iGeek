package com.igeek.decorator;

public class Suger extends Decorator {

	public Suger(Drink drink) {
		super(drink);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()*2;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info()+"加糖";
	}
	
	

}
