package com.oop.coffee.run;

import com.oop.coffee.controller.CoffeeManager;

public class Run {

	public static void main(String[] args) {
		// control클래스 객체생성
		CoffeeManager c = new CoffeeManager();
		
		// 입력메서드
		c.inputCoffee();
		
		// 출력메서드
		c.printCoffee();

	}

}
