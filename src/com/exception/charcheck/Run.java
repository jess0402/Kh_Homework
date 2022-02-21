package com.exception.charcheck;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Run hw = new Run();
		hw.test1();

	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("영문자를 체크할 문자열 입력: ");
			String s = sc.nextLine();
			
			CharacterProcess cp = new CharacterProcess();
			System.out.println(cp.countAlpha(s));
			
		} catch(CharCheckException e) {
			System.out.println(e.getMessage());
		}
	}

}
