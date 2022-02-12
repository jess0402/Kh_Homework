package member.controller;

import java.util.Scanner;

import member.model.vo.Gold;
import member.model.vo.Silver;

public class MemberManager {
	Scanner sc = new Scanner(System.in);
	private static final int maxnum = 10;
	Silver[] s = new Silver[maxnum];
	Gold[] g = new Gold[maxnum];
	private static int silverindex = 0;
	private static int goldindex = 0;
	
	
	public void silverInsert(Silver ss) {
		if(silverindex == maxnum) 
			System.out.println("최대 입력 가능 인원수를 초과하였습니다.");
		else {
			s[silverindex++] = ss;
		}
	
	}
	
	public void goldInsert(Gold gg) {
		if(goldindex == maxnum) 
			System.out.println("최대 입력 가능 인원수를 초과하였습니다.");
		else {
			g[goldindex++] = gg;
		}
		
	}
	
	public void printData() {
		System.out.println("-----------------<<회원정보>>-----------------");
		System.out.println("이름\t등급\t포인트\t이자포인트");
		System.out.println("--------------------------------------------");
		for(int i = 0; i < silverindex; i++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", 
							   s[i].getName(), s[i].getGrade(),
							   s[i].getPoint(), s[i].getInterest());
		}
		
		for(int j = 0; j < goldindex; j++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", 
							   g[j].getName(), g[j].getGrade(),
							   g[j].getPoint(), g[j].getInterest());
		}
		
		
	}
	
	

}
