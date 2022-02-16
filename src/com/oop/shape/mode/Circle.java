package com.oop.shape.mode;

public class Circle extends Shape {
	
	private double radius;

	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * radius * Math.PI;
	}

	@Override
	public double perimeter() {
		return 2 * radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
