package com.dragonsoft.designpattern.structure.bridge;

public abstract class Coffee {
	
	protected ICoffeeAdditive coffeeAdditive;

	public Coffee(ICoffeeAdditive coffeeAdditive) {
		this.coffeeAdditive = coffeeAdditive;
	}
	
	public void orderCoffee() {
		coffeeAdditive.addCoffeeAdditive();
	}
	
}
