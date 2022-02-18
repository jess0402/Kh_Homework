package com.api.calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayTest {

	public static void main(String[] args) {
		
		// 오늘은 2022년 2월 18일 금요일
		SimpleDateFormat sdf = new SimpleDateFormat("오늘은 yyyy년 M월 dd일 E요일");
		String formattedDate = sdf.format(new Date());
		System.out.println(formattedDate);
		

	}

}
