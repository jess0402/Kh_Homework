// 220128 Homework
// Array

package kh.java.test.array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 hw = new Test3();
		hw.test();

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력받기
		System.out.print("입력값: ");
		String userword = sc.next();		
		char[] ch = new char[userword.length()];
		
		// 검색할 문자 입력받기
		System.out.print("검색값: ");
		char search = sc.next().charAt(0);
		
		int cnt = 0;
		
		for(int i = 0; i < ch.length; i++) {
			// 입력받은 문자열 문자배열에 넣기
			ch[i] = userword.charAt(i);
			// 검색할 문자가 문자열에 몇개인지 개수 계산
			if(search == ch[i])
				cnt++;	
		}

		// 출력
		System.out.printf("입력하신 문자열 %s에서 찾으시는 문자 %c는 %d개 입니다.", userword, search, cnt);
		
	}

}
