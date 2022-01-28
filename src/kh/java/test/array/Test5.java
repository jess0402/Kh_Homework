// 220128 Homework
// Array

package kh.java.test.array;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 hw = new Test5();
		hw.test();

	}
	
    // 주민등록번호 성별자리 이후부터 *로 가리기.  
	// 단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		// 주민번호 입력받기 
		System.out.print("주민번호를 입력하세요 : ");
		String user = sc.nextLine();
		
		// 주민번호 저장할 배열
		char[] idnum = new char[user.length()];
		
		// 주민번호 배열에 넣기
		for(int i = 0; i < idnum.length; i++)
			idnum[i] = user.charAt(i);
		
		// 배열 복사본 생성
		char[] idnumcopy =  new char[idnum.length];
		System.arraycopy(idnum, 0, idnumcopy, 0, idnum.length);
		
		System.out.print("주민번호 : ");
		// 성별자리 이후부터 *로 가리기
		for(int i = 0; i < idnumcopy.length; i++) {
			if(i == 6) 
				idnumcopy[i] = '-';
			if(i > 7)
				idnumcopy[i] = '*';
			System.out.print(idnumcopy[i]);
		}

	}

}
