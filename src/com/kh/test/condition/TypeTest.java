// 220125 실습문제
// 문제 3

package com.kh.test.condition;

import java.util.Scanner;

public class TypeTest {

	public static void main(String[] args) {
		TypeTest t = new TypeTest();
		t.typecheck();
	}
	
	public void typecheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 하나 입력하시오 : ");
		String temp = sc.next();
		char user = temp.charAt(0);
		int usernum = (int)user;
		
		if(usernum >= 48 && usernum <= 57) {
			System.out.printf("입력하신 문자 %c 은/는 숫자입니다.%n", user);
		}
		else if((usernum >= 65 && usernum <= 90) || (usernum >= 97 && usernum <= 122)) {
			System.out.printf("입력하신 문자 %c 은/는 알파벳입니다.%n", user);
		}
		else if(usernum < 32 || usernum > 126) {
			System.out.printf("아스키코드 표에 없는 문자입니다.");
		}
		else {
			System.out.printf("입력하신 문자 %c 은/는 특수문자입니다.%n", user);
		}
		
	}


// 		else if (ch >= '가' && ch <= '힣')


//	public void charTest() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println();
//		
//		char ch = sc.next().charAt(0);
//		
//		String result = "";
//		
//		if(Character.isDigit(ch))
//			result = "숫자";
//		else if (Character.isUpperCase(ch) || Character.isLowerCase(ch))
//			result = "알파벳";

//		System.out.println("입력하신 문자 " + ch  + "는" + result + "입니다.");
//	}


//		else if(Test.isKoreanCharacter(ch))
//			result = "한글";
//		
	public static boolean isKoreanCharacter(char ch) {
//		boolean bool = ch >= '가' && ch <= '힣';
//		return bool;
		return ch >= '가' && ch <= '힣';
	}
}
