// 220126 과제
//	문자열과 문자열에서 검색될 문자를 입력 받아 문자열에 그 문자가 몇 개이었는지 개수를 확인하는 프로그램

package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Test4 hw = new Test4();
		hw.cntchar();

	}
	
	public void cntchar() {
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력받기
		System.out.print("문자열 입력 : ");
		String word = sc.next();
		
		// 검색할 문자 입력받기
		System.out.print("검색할 문자 입력: ");
		char ch = sc.next().charAt(0);
		
		int cnt = 0;

	    //문자 개수 확인
		if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
			for(int i = 0; i < word.length(); i++) {
				if(word.charAt(i)==ch) {
					cnt += 1;
				}
			}
		}
		else {
			System.out.println("영문자가 아닙니다.");
		}
		
		System.out.printf("'%c'가 포함된 갯수: %d개", ch, cnt );
	}
}

