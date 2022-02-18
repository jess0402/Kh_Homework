package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcDday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("디데이를 입력하세요(ex. 2022/12/24) : ");
		String[] ddayArr = sc.next().split("/");
		
		int year = Integer.parseInt(ddayArr[0]);
		int month = Integer.parseInt(ddayArr[1]);
		int day = Integer.parseInt(ddayArr[2]);
		
		Calendar today = new GregorianCalendar();
		Calendar Dday = new GregorianCalendar(year, month-1, day);

		long dday = Dday.getTimeInMillis();
		long present = today.getTimeInMillis();
		
		int diff = (int)Math.ceil(((double)dday-present) / 1000 / 60 / 60 / 24);
		
		if(diff == 0)
			System.out.println("D-DAY입니다");
		else if(diff > 0)
			System.out.println(diff + "일 남았습니다.");
		else if(diff < 0)
			System.out.println((diff*-1) + "일 지났습니다.");


	}

}
