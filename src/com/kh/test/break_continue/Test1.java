// 220127 Homework 

package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 hw = new Test1();
//		hw.test1();
		hw.test2();

	}
	
	// 1) 정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		int i = 1;
		int total = 1;
		
		while(true) {
			total *= i;
			i += 2;
			
			if(i > num)
				break;	
		}
		
		System.out.printf("%d부터 %d까지 홀수의 곱은 %d입니다.", 1, num, total);
	}
	
	// 2) 사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		// 정수 두 개 입력받기
		System.out.print("정수를 하나 입력하세요. => ");
		int num1 = sc.nextInt();
		System.out.print("다른 하나 입력하세요. => ");
		int num2 = sc.nextInt();
		
		int bignum;
		int smallnum;
		int sum = 0;
		
		// 큰 수 작은 수 구분
		if(num1 > num2) {
			bignum = num1; smallnum = num2;
		}
		else {
			bignum = num2; smallnum = num1;
		}
		
		// 홀수의 합 구하기
		for(int i = smallnum; i <= bignum; i++) {
			if(i % 2 == 0)
				continue;
			sum += i;

		}
		
		System.out.println("===========================");
		System.out.printf("%d부터 %d까지 홀수의 합은 %d입니다.", smallnum, bignum, sum);
	}
	

}
