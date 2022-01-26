// 220125 실습문제
// 가위바위보게임

package com.kh.test.condition;

import java.util.Random;
import java.util.Scanner;

public class RockSciPaper {

	public static void main(String[] args) {
		RockSciPaper test = new RockSciPaper();
		test.game();

	}
	
	public void game() {
		
		// 컴퓨터 가위바위보 정하기
		Random rnd = new Random();
		int comnum = rnd.nextInt(3) + 1;
		String coms = "가위";
		
		if(comnum == 2) {
			coms = "바위";
		} 
		if(comnum ==3) {
			coms = "보";
		}
		
		System.out.println("===가위 바위 보 게임===");
		
		// 사용자 가위바위보 정하기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보) : ");
		int usernum = sc.nextInt();
		String users = "가위";
		
		if(usernum == 2) {
			users = "바위";
		} 
		if(usernum == 3) {
			users = "보";
		}
		
		System.out.println("========결과========");
		System.out.printf("당신은 %s를 냈습니다.%n컴퓨터는 %s를 냈습니다.%n", users, coms);
		System.out.println("====================");
		
		// 승패 결정
		if(usernum == 1 && comnum == 3) {
			System.out.println("당신이 이겼습니다 ㅠ.ㅠ");
		} 
		else if(usernum == 1 && comnum == 2) {
			System.out.println("컴퓨터가 이겼습니다!");
		}
		else if(usernum == 2 && comnum == 1) {
			System.out.println("당신이 이겼습니다 ㅠ.ㅠ");
		}
		else if(usernum == 2 && comnum == 3) {
			System.out.println("컴퓨터가 이겼습니다!");
		}
		else if(usernum == 3 && comnum == 2) {
			System.out.println("당신이 이겼습니다 ㅠ.ㅠ");
		}
		else if(usernum == 3 && comnum == 1) {
			System.out.println("컴퓨터가 이겼습니다!");
		}
		else {
			System.out.println("비겼습니다!");
		}		
	}

}


// 1, 2, 3이 아닌 경우 무효처리하기
//		if(usernum != 1 && usernum != 2 && usernum != 3) {
//			System.out.println("잘못 입력하셨습니다.");
//			return;  // main 클래스의 호출부인 -> test.game(); 으로 돌아감.
//			
//		}
//		
//		if(usernum > 3 || usernum < 1) {
//			
//		}
//		
//		if(!(usernum == 1 || usernum == 2 || usernum == 3)) {
//			
//		}