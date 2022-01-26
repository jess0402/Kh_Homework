package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 hw = new Test1();
		hw.sumeven();

	}
	
	public void sumeven() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		// 합을 저장할 변수 선언 및 초기화 
		int sum = 0;
		
		// 짝수의 합 구하기
		for(int i = 0; i <= num; i+=2) {
			sum += i;
		}
		
		System.out.println("합 : " + sum);
		
	}
	
	

}
