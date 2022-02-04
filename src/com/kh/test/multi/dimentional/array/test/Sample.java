package com.kh.test.multi.dimentional.array.test;

import java.util.Random;

public class Sample {

	public static void main(String[] args) {
		Sample hw = new Sample();
//		hw.exercise1();
//		hw.exercise2();
		hw.exercise3();
	}

	public void exercise1() {
		Random rnd = new Random();
		
		// 1. 3행 5열 2차원 배열 선언 및 생성
		int[][] arr = new int[3][5];
		
		// 2. 1~100 사이의 임의의 정수를 모든 방에 기록함.
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = rnd.nextInt(100)+1;
				
				// 3. 열의 값이 5의 배수인 경우에만 값(행,열) 출력함
				if(arr[i][j] % 5 == 0) 
					System.out.printf("arr[%d][%d] = %d%n", i, j, arr[i][j]);
			}
		}
		
	}
	
	public void exercise2() {
			Random rnd = new Random();
			int rowsum = 0;
			int colsum = 0;
		
			// 1. 3행4열 2차원배열 선언 및 생성
			int[][] arr = new int[3][4];
		
			// 2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
			for(int i = 0; i < arr.length; i++) {
				if(i<3) {
					for(int j = 0; j < arr[0].length-1; j++) {
						arr[i][j] = rnd.nextInt(100)+1;	
						rowsum += arr[i][j];	
					}
						arr[i][3] = rowsum;
						rowsum = 0;
				}

				
				else {
					for(int k = 0; k < 3; k++) {
						
					}
					
				}					
					
			}
			// 3. 표 그리기
			System.out.println("   0열 1열 2열 3열");
			
			for(int i = 0; i < arr.length; i++) {
				System.out.printf("%d행 ", i);
				for(int j = 0; j < arr[0].length; j++) {
					System.out.printf("%d ", arr[i][j]);
				}
				System.out.println();
			}

		}
	
	public void exercise3() {
		Random rnd = new Random();
		int rowsum = 0;
	
		// 1. 3행4열 2차원배열 선언 및 생성
		int[][] arr = new int[4][4];
	
		// 2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length-1; j++) {
				arr[i][j] = rnd.nextInt(100)+1;	
				rowsum += arr[i][j];	
			}
				arr[i][3] = rowsum;
				rowsum = 0;
		}
	
	}

}
