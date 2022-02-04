package com.kh.test.nested.loop;

public class StarPrint {
	public static void main(String[] args) {
		
		StarPrint hw = new StarPrint();
		hw.star1();
		hw.star2();
		hw.star3();
		hw.star4();
		hw.star5();
		hw.star6();
		hw.star7();
		
	}
	
	// 실습문제 1
	public void star1() {
		System.out.println("실습문제 1");
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			
			System.out.println();
		}
		System.out.println();
	}
	
	// 실습문제 2
	public void star2() {
		System.out.println("실습문제 2");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++)
				System.out.print("*");
			
			System.out.println();
		}
		System.out.println();
	}
	
	// 실습문제 3
	public void star3() {
		System.out.println("실습문제 3");
		
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= 5; j++) {
				if(i<=j) {
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 실습문제 4
	public void star4() {
		System.out.println("실습문제 4");
		
		for(int i = 0; i < 5; i++) {
			
			// 앞부분 공백 
			for(int j = 0; j < 4-i ; j++ ) {
				System.out.print(" ");
			}
			
			// 중간
			for(int k = 0; k < i*2+1; k++) {
				System.out.print("*");
			}
			
			// 뒷부분 공백
			for(int m = 0; m < 4-i; m++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 실습문제 5
	public void star5() {
		System.out.println("실습문제 5");
		
		for(int i = 0; i < 3; i++) {
			int j = 0;
			while(j < i*2) {
				System.out.print(" ");
				j++;
			}
			
			do {
				System.out.print("*");
				j++;
			} while(j < 5);
			
			System.out.println();
		}
		System.out.println();
	}
	
	// 실습문제 6
	public void star6() {
		System.out.println("실습문제 6");
		
		int n = 1;
		for(int i = 5; i > 0; i--) {
			int j = 0;
			
			// 첫 번째, 두 번째, 세 번째 줄
			if(i > 2) {
				
				while(j < i-n) {
					
					System.out.print(" ");
					j++;
				}

				for(int m = 0; m < n*2-1; m++)
					System.out.print("*");
				
				n++;
				System.out.println();
			}
			
			// 네 번째, 다섯 번째 줄
			else {
				do {
					System.out.print(" ");
					j++;
				} while(j < n/i);
				
				for(;j<=n;j++)
					System.out.print("*");
						
				System.out.println();

			}

		}
		System.out.println();
	}
	
	// 실습문제 7
	public void star7() {
		System.out.println("실습문제 7");
		
		// 상단부
		for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 2-i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < i*2+1; j++) {
					System.out.print("*");
				}
				for(int j = 0; j < 2-i; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
			
			//하단부
		for(int i = 0; i < 2; i++) {
				for(int j = 1; j < i+2; j++) {
					System.out.print(" ");
				}
				for(int j = 3; j >= i*2+1; j--) {
					System.out.print("*");
				}
				for(int j = 1; j < i+2; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}	
	}


