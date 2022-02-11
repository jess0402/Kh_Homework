package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	Scanner sc = new Scanner(System.in);
	private static final int LENGTH = 3;
	Coffee[] c = new Coffee[LENGTH];
	
	public void inputCoffee() {
		for(int i = 0; i < c.length; i++) {
			System.out.println("커피 입력 " + (i+1));
			
			// 커피정보 입력받기
			System.out.print("커피 원산지를 입력하세요: ");
			String origin = sc.next();
			System.out.print("커피명을 입력하세요: ");
			String name = sc.next();
			
			// 객체에 기록
			c[i] = new Coffee(origin, name);
		}
	}
	
	public void printCoffee() {
		String str = "<세계 3대 커피>\n"
				   + "-------------------\n"
				   + "원산지\t커피명\n"
				   + "-------------------\n";
		
		for(int i = 0; i < c.length; i++) {
			str += c[i].getCoffeeInfo();
		}
	
		str += "-------------------";
		
		System.out.println(str);

	}
}
