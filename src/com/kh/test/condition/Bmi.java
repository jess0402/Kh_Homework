package com.kh.test.condition;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Bmi test = new Bmi();
		test.BmiCheck();
		
	}
	
	public void BmiCheck() {
		Scanner sc = new Scanner(System.in);
		
		// 키 입력받기
		System.out.print("키를 입력하시오 : ");
		double height = sc.nextDouble();
		
		// 몸무게 입력받기
		System.out.print("몸무게를 입력하시오 : ");
		double weight = sc.nextDouble();
		
		// bmi 계산
		double bmi = weight / ((height/100) * (height/100));
		
		if(bmi >= 30) {
			System.out.println("고도비만");
		}
		else if(bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		}
		else if(bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		}
		else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		}
		else {
			System.out.println("저체중");
		}
		
	}

}
