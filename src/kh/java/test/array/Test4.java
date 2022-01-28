// 220128 Homework
// Array

package kh.java.test.array;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 hw = new Test4();
//		hw.test1();
		hw.test2();

	}
	
	// 사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
	// 단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력하세요 : ");
		String phonenum = sc.next();
		
		// 전화번호 저장할 배열
		char[] phone = new char[11];
		
		// 전화번호 배열에 저장
		for(int i = 0; i < phone.length; i++)
			phone[i] = phonenum.charAt(i);
		
		// 배열 복사본 생성
		char[] phonecopy = phone.clone();
		
		System.out.print("전화번호 : ");
		// 복사한 배열 가운데 네자리 *로 교체한 후 출력
		for(int i = 0; i < phonecopy.length; i++ ) {
			if(i >= 3 && i <= 6)
				phonecopy[i] = '*';
			System.out.print(phonecopy[i]);

		}
	
	}
	
	// 위 test1() 문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
	public void test2() {
		// 전화번호 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력하세요 : ");
		String phonenum = sc.next();
		
		// 문자열 가운데 네자리 교체
		String phonenum22 = phonenum.substring(0, 3) + "****" + phonenum.substring(7);
		
		//출력
		System.out.println(phonenum22);

	}

}
