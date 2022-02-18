package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

// 사용자로부터 생일(년, 월, 일)을 입력받고, 오늘이 태어난지 몇일 되었는지 출력하세요.
public class CalcYourDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("태여난 월을 입력하세요 : ");
		int month = sc.nextInt();
		System.out.print("태어난 일을 입력하세요 : ");
		int day = sc.nextInt();
		
		// 오늘 
		Calendar today = Calendar.getInstance();
		
		// 생일 
		Calendar birthday = new GregorianCalendar(year, month-1, day);
		
		// millis 초단위 변환 후 계산
		long present = today.getTimeInMillis();
		long birthd = birthday.getTimeInMillis();
		
		double diff = ((double) present - birthd) / 1000 / 60 / 60 / 24;
		
		// 올림처리
		System.out.println("오늘은 태어난지 D+" + (int)(Math.floor(diff)) + "일입니다.");

	}

}
