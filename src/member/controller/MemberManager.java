package member.controller;

import java.util.Scanner;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class MemberManager {
	Scanner sc = new Scanner(System.in);
	private static final int maxnum = 10;
	Silver[] s = new Silver[maxnum];
	Gold[] g = new Gold[maxnum];
	Vip[] vip = new Vip[maxnum];
	VVip[] vvip = new VVip[maxnum];
	private static int silverindex = 0;
	private static int goldindex = 0;
	private static int vipindex = 0;
	private static int vvipindex = 0;
	
	
	
	
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
	
	public void vipInsert(Vip v) {
		if(goldindex == maxnum) 
			System.out.println("최대 입력 가능 인원수를 초과하였습니다.");
		else {
			vip[vipindex++] = v;
		}
		
	}
	
	public void vvipInsert(VVip vv) {
		if(goldindex == maxnum) 
			System.out.println("최대 입력 가능 인원수를 초과하였습니다.");
		else {
			vvip[vvipindex++] = vv;
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
		
		for(int m = 0; m < vipindex; m++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", 
							   vip[m].getName(), vip[m].getGrade(),
							   vip[m].getPoint(), vip[m].getInterest());
		}
		
		for(int n = 0; n < vvipindex; n++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", 
							   vvip[n].getName(), vvip[n].getGrade(),
							   vvip[n].getPoint(), vvip[n].getInterest());
		}
	
	}

	
	
	

}
