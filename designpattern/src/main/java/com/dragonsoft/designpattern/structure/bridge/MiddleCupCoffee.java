package com.dragonsoft.designpattern.structure.bridge;

public class MiddleCupCoffee extends Coffee{

	public MiddleCupCoffee(ICoffeeAdditive coffeeAdditive) {
		super(coffeeAdditive);
	}

	@Override
	public void orderCoffee() {
		System.out.println("订一中杯咖啡...");
		super.orderCoffee();
	}

}
