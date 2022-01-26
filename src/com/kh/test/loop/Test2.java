// 220126 과제
// 	정수를 입력 받아 1부터 입력 받은 정수까지 수를 홀수와 짝수로 나눠서 홀수면 "수", 짝수면 "박" 출력

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
