package com.oop.coffee.model.dto;

public class Coffee {
	private String origin; 
	private String coffeeName;
	
	// 기본 생성자
	public Coffee() {}
	
	// 모든 필드 초기화 생성자
	public Coffee(String origin, String coffeeName) {
		this.origin = origin;
		this.coffeeName = coffeeName;
	}
	
	// getter/setter
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	// 출력메서드()
	public String getCoffeeInfo() {
		return origin + "\t" + coffeeName + "\n";
	}

}
