// // 220128 Homework
// Array

package kh.java.test.array;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Test6 hw = new Test6();
		hw.test();
	}
	
	
//  배열의 크기로 홀수인 양의 정수를 입력 받아 배열을 만드세요. 
//	배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 
//	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하는 프로그램을 작성하세요.
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		// 배열 크기가 될 홀수인 양의 정수 입력받기
		System.out.print("홀수인 양의 정수를 하나 입력하세요: ");
		int len = sc.nextInt();
		
		// 배열 만들기
		int[] arr = new int[len];
		
		int mid = len / 2;
		
		for(int i = 0; i < arr.length; i++) {
			if(i > mid) {
				arr[i] = mid--;
				continue;
			}
			arr[i] = i+1;
		}
		
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.println(arr[i] + "]");
				break;
			}
			System.out.print(arr[i]+ ", ");
		}
	
	}

}


