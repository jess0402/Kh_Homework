// 220127 Homework
// 분식집 주문 받는 프로그램 

package com.kh.test.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Test8 hw = new Test8();
//		hw.order();
		hw.test();

	}

	public void order() {
		List<Integer> foodlist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String menu = "메뉴\n"
					+ "김밥류 =================\n"
					+ "1. 원조김밥========1500원\n"
					+ "2. 치즈김밥========2000원\n"
					+ "3. 참치김밥========2300원\n"
					+ "라면류==================\n"
					+ "4. 그냥라면========3000원\n"
					+ "5. 치즈라면========3500원\n"
					+ "6. 짬뽕라면========4000원\n"
					+ "분식류==================\n"
					+ "7. 떡볶이==========2500원\n"
					+ "8. 순대===========2500원\n"
					+ "9. 오뎅===========1000원\n"
					+ "기타===================\n"
					+ "10. 음료수=========1000원\n";
		
		int qty2 = 0;
		int total = 0; 
		char yn = ' ';
		
		while(true) {
			// 메뉴 출력
			System.out.println(menu);
			
			//1. 메뉴 선택
			System.out.print("메뉴 번호를 입력하세요 : ");
			int choice = sc.nextInt();
			foodlist.add(choice);
	
			//2. 수량 선택
			System.out.print("수량을 입력하세요 : ");
			int qty = sc.nextInt();
			foodlist.add(qty);
			
			// 3. 추가 주문 선택
			System.out.print("추가 주문 하시겠습니까? (y/n) : ");
			yn = sc.next().charAt(0);
			// 4. n면 빠져나가기
			if(yn == 'n')
				break;	
		}
		
		System.out.println();
		System.out.println("결과");
		System.out.println("주문하신 정보는 다음과 같습니다.");
		System.out.println("-------------------------");
		
		for(int i = 0; i < foodlist.size(); i+=2) {
			qty2 = foodlist.get(i+1);
			
			switch(foodlist.get(i)) {
			case 1:
				System.out.printf("원조김밥: %d개 - %d원%n", qty2, qty2 * 1500);
				total += (qty2 * 1500); break;
			case 2:
				System.out.printf("치즈김밥: %d개 - %d원%n", qty2, qty2 * 2000);
				total += (qty2 * 2000); break;
			case 3:
				System.out.printf("참치김밥: %d개 - %d원%n", qty2, qty2 * 2300);
				total += (qty2 * 1500); break;
			case 4:
				System.out.printf("그냥라면: %d개 - %d원%n", qty2, qty2 * 3000);
				total += (qty2 * 3000); break;
			case 5:
				System.out.printf("치즈라면: %d개 - %d원%n", qty2, qty2 * 3500);
				total += (qty2 * 3500); break;
			case 6:
				System.out.printf("짬뽕라면: %d개 - %d원%n", qty2, qty2 * 4000);
				total += (qty2 * 4000); break;
			case 7:
				System.out.printf("떡볶이: %d개 - %d원%n", qty2, qty2 * 2500);
				total += (qty2 * 1500); break;
			case 8:
				System.out.printf("순대: %d개 - %d원%n", qty2, qty2 * 2500);
				total += (qty2 * 1500); break;
			case 9:
				System.out.printf("오뎅: %d개 - %d원%n", qty2, qty2 * 1000);
				total += (qty2 * 1500); break;	
			case 10:
				System.out.printf("음료수: %d개 - %d원%n", qty2, qty2 * 1000);
				total += (qty2 * 1000); break;	
			}
		}
		
		System.out.println("-------------------------");
		System.out.printf("합계: %d원", total);		
	}


		public void test() {
			Scanner sc = new Scanner(System.in);
			int menu = 0;
			int count = 0;
			int sum = 0;
			
			int m1 = 0;
			int m2 = 0;
			int m3 = 0;
			int m4 = 0;
			int m5 = 0;
			int m6 = 0;
			int m7 = 0;
			int m8 = 0;
			int m9 = 0;
			int m10 = 0;
			
			while(true) {
				printMenu();
				
				System.out.println("1. 메뉴선택");
				menu = sc.nextInt();
				
				System.out.println("2. 수량선택");
				count = sc.nextInt();
				
				switch(menu) {
				case 1:
					m1 += count;
					break;
				case 2:
					m2 += count;
					break;
				case 3:
					m3 += count;
					break;
				case 4:
					m4 += count;
					break;
				case 5:
					m5 += count;
					break;
				case 6:
					m6 += count;
					break;
				case 7:
					m7 += count;
					break;
				case 8:
					m8 += count;
					break;
				case 9:
					m9 += count;
					break;
				case 10:
					m10 += count;
					break;
				}

				System.out.println("3. 추가주문선택 (y/n)");
				char c = sc.next().charAt(0);
				if( c=='y') {
					continue;
					
				}else if(c == 'n'){
					break;
				}
			}
			System.out.println("결과");
			System.out.println("주문하신 정보는 다음과 같습니다.");
			System.out.println("----------------------------------------");
			
			if(m1 != 0) {
				System.out.printf("원조김밥 : %d개 - %d원\n",m1 ,1500 * m1);
				sum += 1500 * m1;
			}
			if(m2 != 0) {
				System.out.printf("치즈김밥 : %d개 - %d원\n",m2 ,2000 * m2);
				sum += 2000 * m2;
			}
			if(m3 != 0) {
				System.out.printf("참치김밥 : %d개 - %d원\n",m3 ,2300 * m3);
				sum += 2300 * m3;
			}
			if(m4 != 0) {
				System.out.printf("그냥라면 : %d개 - %d원\n",m4 ,3000 * m4);
				sum += 3000 * m4;
			}
			if(m5 != 0) {
				System.out.printf("치즈라면 : %d개 - %d원\n",m5 ,3500 * m5);
				sum += 3500 * m5;
			}
			if(m6 != 0) {
				System.out.printf("짬뽕라면 : %d개 - %d원\n",m6 ,4000 * m6);
				sum += 4000 * m6;
			}
			if(m7 != 0) {
				System.out.printf("떡볶이 : %d개 - %d원\n",m7 ,2500 * m7);
				sum += 2500 * m7;
			}
			if(m8 != 0) {
				System.out.printf("순대 : %d개 - %d원\n",m8 ,2500 * m8);
				sum += 2500 * m8;
			}
			if(m9 != 0) {
				System.out.printf("오뎅 : %d개 - %d원\n",m9 ,1000 * m9);
				sum += 1000 * m9;
			}
			if(m10 != 0) {
				System.out.printf("음료수 : %d개 - %d원\n",m10 ,1000 * m10);
				sum += 1000 * m10;
			}
			System.out.println("----------------------------------------");
			System.out.printf("합계 : %d원",sum);
			
		}
		public static void printMenu() {
			System.out.println("메뉴");
			System.out.println("김밥류 ==============================");
			System.out.println("1.원조김밥=======================1500원");
			System.out.println("2.치즈김밥=======================2000원");
			System.out.println("3.참치김밥=======================2300원");
			System.out.println("라면류 ==============================");
			System.out.println("4.그냥라면=======================3000원");
			System.out.println("5.치즈라면=======================3500원");
			System.out.println("6.짬뽕라면=======================4000원");
			System.out.println("분식류 ==============================");
			System.out.println("7.떡볶이=======================2500원");
			System.out.println("8.순대=======================2500원");
			System.out.println("9.오뎅=======================1000원");
			System.out.println("기타    ==============================");
			System.out.println("10.음료수=======================1000원");
		}

}
	
