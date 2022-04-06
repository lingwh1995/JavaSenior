package com.dragonsoft.algorithm.recursion;

import org.junit.Test;

/**
 * 递归
 * @author lingwh
 *
 */
public class Recursion {

	@Test
	public void fun() {
		//printNum1(1,100);
		printNum2(100,200);
	}
	
	/**
	 * 递归打印1-100
	 * @param begin
	 * @param end
	 */
	private void printNum1(int begin,int end) {
		if(begin > end) {
			return;
		}
		System.out.println(begin);
		printNum1(++begin,end);
	}
	private void printNum2(int begin,int end) {
		if(begin <= end) {
			System.out.println(begin);
			printNum2(++begin,end);
		}
	}
}
