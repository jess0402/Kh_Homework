// 220126 과제
// 회원정보를 입력 받아 저장하고 출력하는 프로그램

package com.kh.test.loop;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 hw = new Test5();
		hw.info();

	}
	
	public void info() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 회원 수는 몇명입니까? : ");
		int num = sc.nextInt();
		
		String[] name = new String[num];   // 이름 
		int[] age = new int[num];		   // 나이
		String[] addr = new String[num];   // 주소
		int[] height = new int[num]; // 키
		int[] weight = new int[num]; // 몸무게
		String[] phone = new String[num];  // 전화번호
		
		// 회원 입력받기
		for(int i = 0; i < num; i++) {
			
			System.out.print("이름 : ");
			name[i] = sc.next();
			
			System.out.print("나이 : ");
			age[i] = sc.nextInt();
			sc.nextLine();
			
			System.out.print("주소: ");
			addr[i] = sc.nextLine();
			
			System.out.print("키: ");
			height[i] = sc.nextInt();
			
			System.out.print("몸무게: ");
			weight[i] = sc.nextInt();
			
			System.out.print("연락처: ");
			phone[i] = sc.next();		
			
			System.out.println();
		}
		
		System.out.println("================저장회원=================");
		
		// 회원정보 출력
		for(int i = 0; i < num; i++) {
			System.out.printf("%d %s %d세 %s %dcm %dkg %s%n", 
							i+1, name[i], age[i], addr[i], height[i], weight[i], phone[i] );
		}
		
		System.out.println("=======================================");
		
		// 나이, 키, 평균 몸무게 
		int sumage = 0;
		int sumheight = 0;
		int sumweight = 0;
		
		for(int i = 0; i < num; i++) {
			sumage += age[i];
			sumheight += height[i];
			sumweight += weight[i];
		}
		
		System.out.printf("평균나이 : %d세 / 평균 키 : %dcm / 평균 몸무게 : %dkg ",
							sumage/num, sumheight/num, sumweight/num);
		
	}

}
