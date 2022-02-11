package com.oop.person.run;

import com.oop.person.controller.PersonController;

public class Run {

	public static void main(String[] args) {
		// controll클래스 객체생성
		PersonController pc = new PersonController();
		
		// 입력 메서드 호출
		pc.inputPerson();
		
		// 출력 메서드 호출
		pc.printPerson();
		
		System.out.println();
		
		// 평균 메서드 호출
		pc.printAverage();

	}

}
