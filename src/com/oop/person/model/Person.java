package com.oop.person.model;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	private int wealth;
	
	// 기본 생성자
	public Person() {}
	
	// 모든 필드 초기화 생성자
	public Person(String name, int age, double height, double weight, int wealth) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.wealth = wealth;
	}
	
	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
	// 출력메서드
	public String information() {
		return "[이름: " + name + ", 나이: " + age + ", 키: " + height 
				+ ", 몸무게: " + weight + ", 재산: " + wealth + "]"; 
	}
	
	
	
}
