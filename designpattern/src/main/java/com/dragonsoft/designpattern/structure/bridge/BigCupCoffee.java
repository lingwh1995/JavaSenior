package com.dragonsoft.designpattern.structure.bridge;

public class BigCupCoffee extends Coffee{

	public BigCupCoffee(ICoffeeAdditive coffeeAdditive) {
		super(coffeeAdditive);
	}

	@Override
	public void orderCoffee() {
		System.out.println("订一大杯咖啡...");
		super.orderCoffee();
	}

}
