// 220125 실습문제
// 문제 3

package com.kh.test.condition;

import java.util.Scanner;

public class Caculator {
	public static void main(String[] args) {
		Caculator cc = new Caculator();
		cc.inputnum();
		
	}
	
	public void inputnum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 두 개를 입력하시오 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("잘못 입력 하셨습니다. 프로그램을 종료합니다.");
		}
		
		System.out.print("사칙연산을 입력하시오(+,-,*,/) : ");
		String operator = sc.next();
		char op = operator.charAt(0);
		
		if(op == '+') {
			System.out.printf("입력: %d, %d, %c%n %d + %d = %d", num1, num2, op, num1, num2, num1 + num2);
		}
		else if(op == '-') {
			System.out.printf("입력: %d, %d, %c%n %d - %d = %d", num1, num2, op, num1, num2, num1 - num2);
		}
		else if(op == '*') {
			System.out.printf("입력: %d, %d, %c%n %d * %d = %d", num1, num2, op, num1, num2, num1 * num2);
		}
		else if(op == '/') {
			System.out.printf("입력: %d, %d, %c%n %d / %d = %d", num1, num2, op, num1, num2, num1 / num2);
		}
		else {
			System.out.println("잘못 입력 하셨습니다.  프로그램을 종료합니다.");
		}	
	}
}
