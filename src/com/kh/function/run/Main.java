package com.kh.function.run;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main hw = new Main();
//		hw.opSample1();
//		hw.opSample2();
//		hw.opSample3();
		hw.opSample4();
	}
	
	// 문제 1
	public void opSample1() {
		Scanner sc = new Scanner(System.in);
		int kor;
		int eng;
		int math;
		int total;
		double avg;
		
		// 국어 점수 입력
		System.out.print("국어 점수를 입력하시오 : ");
		kor = sc.nextInt();
		
		// 영어 점수 입력
		System.out.print("영어 점수를 입력하시오 : ");
		eng = sc.nextInt();
		
		// 수학 점수 입력
		System.out.print("수학 점수를 입력하시오 : ");
		math = sc.nextInt();

		// 합계와 평균 계산
		total = kor + eng + math; 
		avg = total/3.0;
		
		// 합격 or 불합격
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ) ? "합격" : "불합격";
		System.out.println(result);

	}
	
	// 문제 2
	public void opSample2() {
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		String name;    // 이름
		int year;  		// 학년
		int ban;		// 반
		int number;		// 번호
		String gender;	// 성별
		double score;   // 성적
		
		// 입력받기
		System.out.print("이름을 입력하시오 : ");
		name = sc.next();
		
		System.out.print("학년을 입력하시오 : ");
		year = sc.nextInt();
		
		System.out.print("반을 입력하시오 : ");
		ban = sc.nextInt();
		
		System.out.print("번호를 입력하시오 : ");
		number = sc.nextInt();
		
		System.out.print("성별을 입력하시오(남|여) : ");
		gender = sc.next();
		char sex = gender.charAt(0);
		
		System.out.print("성적을 입력하시오 : ");
		score = sc.nextDouble();
		
		// 출력 
		System.out.printf("%d학년 %d반 %d번 %c학생 %s은/는 성적이 %.2f이다.", year, ban, number, sex, name, score);
	}
	
	// 문제 3
	public void opSample3() {
		Scanner sc = new Scanner(System.in);
		
		// 1. 정수 변수 선언 
		int a;
		
		// 2. 키보드로부터 정수 하나 입력받음
		System.out.print("정수를 하나 입력하시오 : ");
		a = sc.nextInt();
		
		// 3. 입력받은 정수 양수인지 음수인지 확인 
		String temp = (a > 0) ? "양수다." : "양수가 아니다.";
		System.out.println(temp);
		
	}
	
	// 문제 4
	public void opSample4() {
		Scanner sc = new Scanner(System.in);
		
		// 1. 정수 변수 선언
		int inum;
		// 2. 문자열 변수 선언
		String str;
		
		// 3. 키보드로부터 정수 하나 입력받음
		System.out.print("정수를 하나 입력하시오 : ");
		inum = sc.nextInt();
		
		// 4. 입력받은 정수가 짝수인지 아닌지 확인
		str = (inum % 2 == 0) ? "짝수다." : "홀수다";
		System.out.println(str);	
		
	}

}
