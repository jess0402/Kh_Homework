package com.oop.employee.controller;

import com.oop.employee.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		// 기본생성자를 통한 객체 생성
		Employee emp0 = new Employee();
		
		// 4개의 클래스변수를 받는 생성자를 통해 객체 생성
		Employee emp1 = new Employee(1, "홍길동", '남', "010-1234-5678");
		
		// 7개의 클래스변수를 받는 생성자를 통해 객체 생성
		Employee emp2 = new Employee(2, "유관순", '여', "010-3131-3131", "영업부", 3_000_000, 0.15);
		
		
		// 기본생성자 객체의 정보 출력
		emp0.printEmployee();
		
		// 4개 클래스변수를 받는 생성자를 통해 생성된 객체 정보 출력
		emp1.printEmployee();
		
		// 7개 클래스변수를 받는 생성자를 통해 생성된 객체 정보 출력
		emp2.printEmployee();

	}

}
