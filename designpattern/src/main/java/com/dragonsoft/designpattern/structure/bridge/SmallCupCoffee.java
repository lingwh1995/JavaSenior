package com.dragonsoft.designpattern.structure.bridge;

public class SmallCupCoffee extends Coffee{
	
	public SmallCupCoffee(ICoffeeAdditive coffeeAdditive) {
		super(coffeeAdditive);
	}

	@Override
	public void orderCoffee() {
		System.out.println("订一小杯咖啡...");
		super.orderCoffee();
	}
}
