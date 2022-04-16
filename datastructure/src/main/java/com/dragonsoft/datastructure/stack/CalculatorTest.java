package com.dragonsoft.datastructure.stack;

import org.junit.Test;

public class CalculatorTest {
	
	/**
	 * 测试10以内包括10的加减乘除运算
	 */
	@Test
	public void fun1() {
		Calculator calculator = new Calculator();
		String expression = "1+2+10/5";
		calculator.calcExpression1to10(expression);
		
	}
	
	/**
	 * 测试任意位数数字加减乘除运算
	 */
	@Test
	public void fun2() {
		Calculator calculator = new Calculator();
		String expression = "50+5*5+500/20+900-500";
		calculator.calcExpressionAny(expression);
	}
	
	/**
	 * 测试任意位数数字加减乘除运算(可以运算带有括号的表达式)
	 */
	@Test
	public void fun3() {
		Calculator calculator = new Calculator();
		String expression = "(10*2+5*(15-5))/2+(10+(2*(10+10)))/10+1000";
		calculator.calcExpressionAnyWithBrackets(expression);
	}
	
}
