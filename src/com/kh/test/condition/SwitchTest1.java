package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		SwitchTest1 hw = new SwitchTest1();
		hw.WaterTex();

	}
	
	public void WaterTex() {
		Scanner sc = new Scanner(System.in);
		String message = "--------menu--------\n"
					   + "1. 가정용 (50원/liter)\n"
					   + "2. 상업용 (45원/liter)\n"
					   + "3. 공업용 (30원/liter)\n"
					   + "--------------------\n";
		System.out.print(message);
		
		// 메뉴번호 입력받기
		System.out.print("메뉴번호를 선택하세요. ==> ");
		int num = sc.nextInt();
		// 물사용량 입력받기
		System.out.print("물 사용량을 입력하세요. ==> ");
		int waterused = sc.nextInt();
		
		System.out.println();
		
		// 사용요금 계산
		System.out.println("-----------<<수도세>>------------");
		
		int fee = 0;
		
		switch(num) {
		case 1:	
			System.out.println("선택메뉴번호 : 1. 가정용(가정에서 사용하실 경우)를 선택하셨습니다.");
			fee = 50 * waterused;
			break;
		case 2: 
			fee = 45 * waterused; 
			System.out.println("선택메뉴번호 : 2. 상업용(업소에서 사용하실 경우)를 선택하셨습니다.");
			break;
		case 3: 
			fee = 30 * waterused; 
			System.out.println("선택메뉴번호 : 3. 공업용(공장에서 사용하실 경우)를 선택하셨습니다.");
			break;
		default : System.out.println("메뉴번호는 1,2,3만 가능합니다."); return;
		}
		
		
		System.out.printf("사용요금 : %d원%n", fee);
		System.out.printf("수도세 : %d원%n", (int)(fee * 0.05));
		System.out.printf("총 수도요금 : %d원%n", fee + (int)(fee * 0.05));
		
	}

}


