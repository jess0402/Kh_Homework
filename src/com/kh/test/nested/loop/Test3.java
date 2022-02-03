package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 hw = new Test3();
		hw.test();

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int n = sc.nextInt();
		int num = n * 2;
		
		if(n < 0) {
			System.out.println("양수가 아닙니다.");
		}
		else {
			outer: 
			for(int i = 1; i < num; i++) {
				if(i > n) {
					for(int k = 1; k < n; k++) {
						for(int m = 0; m < k; m++) {
							System.out.print(" ");
						}
						for(int p = n; p > k; p--) {
							System.out.print("*");
						}
						System.out.println();
					}
					break outer;
				}

				
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
