package com.oop.person.controller;

import java.util.Scanner;

import com.oop.person.model.Person;

public class PersonController {
	Scanner sc = new Scanner(System.in);
	private static final int LENGTH = 5;
	Person[] person = new Person[LENGTH];
	private int index = 0;
	
	public void insertPerson(Person p) {
		person[index++] = p;
	}
	
	public void inputPerson() {
		for(int i = 0; i < person.length; i++) {
			System.out.println("사람 " + (i+1));
			System.out.print("이름을 입력하세요: ");
			String name = sc.next();
			System.out.print("나이를 입력하세요: ");
			int age = sc.nextInt();
			System.out.print("키를 입력하세요: ");
			double height = sc.nextDouble();
			System.out.print("몸무게를 입력하세요: ");
			double weight = sc.nextDouble();
			System.out.print("재산을 입력하세요: ");
			int wealth = sc.nextInt();
			
			insertPerson(new Person(name, age, height, weight, wealth));
			
			System.out.println();
		}
	}
	
	public void printPerson() {
		for(int i = 0; i < person.length; i++) {
			System.out.println(person[i].information());
		}
		
	}
	
	public void printAverage() {
		double ageavg = 0;
		double heightavg = 0;
		double weightavg = 0;
		double wealthavg = 0;
		
		// 나이 평균
		for(int i = 0; i < person.length; i++) {
			ageavg += person[i].getAge(); 
			heightavg += person[i].getHeight(); 
			weightavg += person[i].getWeight(); 
			wealthavg += person[i].getWealth(); 
		}
		
		ageavg = ageavg/person.length;
		heightavg = heightavg/person.length;
		weightavg = weightavg/person.length;
		wealthavg = wealthavg/person.length;
		
		String str = "나이 평균: " + ageavg + "\n"
				   + "키 평균: " + heightavg + "\n"
			       + "몸무게 평균: " + weightavg + "\n"
			       + "재산 평균: " + wealthavg; 
		
		System.out.println(str);
	}
	

}
