package com.api.member.run;

import java.util.Calendar;
import java.util.StringTokenizer;

import com.api.member.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		int len = 3;
		Member[] memberArr = new Member[len];
		int cnt = 0;

		String str1 = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		
		StringTokenizer tokenizer = new StringTokenizer(str1, "|");
		
		while(tokenizer.hasMoreTokens()) {
			String str2= tokenizer.nextToken();
			StringTokenizer tokenizer2 = new StringTokenizer(str2, ",");
			String[] member = new String[tokenizer2.countTokens()];
			
			int idx = 0;
			while(tokenizer2.hasMoreTokens()) 
				member[idx++] = tokenizer2.nextToken();
			
			int n = Integer.parseInt(member[0]);
			String name = member[1];
			int height = Integer.parseInt(member[2]);
			int weight = Integer.parseInt(member[3]);
			
			int year = Integer.parseInt(member[4].substring(0, 4));
			int month = Integer.parseInt(member[4].substring(4, 6));
			int day = Integer.parseInt(member[4].substring(6, 8));
			
			// 생일
			Calendar birthday = Calendar.getInstance();
			birthday.set(year, month, day);
			
			// 정보가 담긴 멤버 객체 생성 및 배열에 담기
			memberArr[cnt++] = new Member(n, name, height, weight, birthday);	

		}
		
		// 정보 출력
		for(Member m : memberArr)
			System.out.println(m.information());
		
	}

}
