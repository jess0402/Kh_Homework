package com.kh.test;

public class Test2 {
	public static void main(String[] args) {
		
		String name = "장은성";
		int age = 24;
		char sex = '여';
		String phone = "01029767191";
		String email = "jyjmjs2@naver.com";
		String address = "경기도 용인시";
		
		//상단부
		System.out.println("=======================================================================");
		System.out.println("이름\t나이\t성별\t전화번호\t\t이메일\t\t주소");
		System.out.println("=======================================================================");
		
		//내 정보
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n", name, age, sex, phone, email, address);
		
		//변수 값 변경
		name = "홍길동";
		age = 22;
		sex = '남';
		phone = "01012341234";
		email = "hgd@naver.com";
		address = "경기도 광주시";
		
		//재사용한 변수 출력
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n", name, age, sex, phone, email, address);
	}

}
