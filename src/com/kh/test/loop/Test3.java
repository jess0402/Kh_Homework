// 220126 과제
// 입력받은 정수의 구구단 출력하는 프로그램  

package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 hw = new Test3();
		hw.gugudan();

	}

	public void gugudan() {
		
		// 출력할 단 사용자로부터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력할까요?(숫자로 입력) : ");
		int num = sc.nextInt();
		
		if(num < 1 || num > 9) {
			System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		else {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%dX%d=%d%n", num, i, num * i);
			}
		}
	}
}
