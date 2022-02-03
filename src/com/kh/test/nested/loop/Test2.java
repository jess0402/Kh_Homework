package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 hw = new Test2();
		hw.test();

	}
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int n = sc.nextInt();
		
		if(n < 0) {
			System.out.println("양수가 아닙니다.");
		}
		else {
			for(int i = n; i > 0; i--) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
