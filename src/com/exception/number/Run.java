package com.exception.number;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		new Run().test1();

	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 두 개 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		NumberProcess np = new NumberProcess();
		
		try {
			
			if(np.checkDouble(a, b))
				System.out.printf("%d은 %d의 배수이다.%n", a, b);
			else
				System.out.printf("%d은 %d의 배수가 아니다.%n", a, b);	
			
		} catch(NumberRangeException e) {
			e.printStackTrace();
		}

	}

}
