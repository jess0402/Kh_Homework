// 220125 실습문제
// 문제 4

package com.kh.test.condition;

import java.util.Scanner;

public class OddEvenNum {
	public static void main(String[] args) {
		OddEvenNum test = new OddEvenNum();
		test.numcheck();
		
	}
	
	public void numcheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 10) {   // 입력받은 num이 1부터 10 사이의 정수인가?
			if(num % 2 == 0) {    // 입력받은 num이 1~10 사이의 정수이고, 2로 나눴을 때 나머지가 0인 짝수면
				System.out.println("짝수다");
			}
			else { // 입력받은 num이 1~10 사이의 정수이고, 2로 나눴을 때 나머지가 0이 아닌 홀수면
				System.out.println("홀수다");
			}
		}
		else {  // 입력받은 num이 1~10 사이의 정수가 아니라면,
			System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
		}
		
	}

}
