package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 hw = new Test2();
		hw.subak();

	}

	public void subak() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 != 0)
				System.out.print("수");
			else
				System.out.print("박");
		}
	}
}
