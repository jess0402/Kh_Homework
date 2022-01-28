// 220128 Homework
// Array

package kh.java.test.array;

public class Test1 {
	public static void main(String[] args) {
		Test1 hw = new Test1();
		hw.test();

	}
	
	public void test() {
		
		// 길이가 100인 배열 선언
		int[] hundred = new int[100];
		
		// 1부터 100까지의 값 넣고 출력
		for(int i = 0; i < hundred.length; i++) {
			hundred[i] = i+1;
			
			// 한 줄에 10개씩 출력
			if(i % 10 == 0) {
				System.out.println();
				System.out.print(hundred[i] + " ");
			}
			else {
				System.out.print(hundred[i] + " ");
			}

		}
		
	}

}

