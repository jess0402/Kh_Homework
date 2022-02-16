package member2.controller;

import member2.model.vo.Member;

public class MemberManager {
	
	private static final int maxnum = 40;
	Member[] members = new Member[maxnum];	

	private static int index = 0;
	private static int price = 10000;
	
	public void insertMember(Member m) {
		if(index == maxnum) 
			System.out.println("최대 입력 가능 인원수를 초과하였습니다.");
		else {
			members[index++] = m;
		}
	}

	public void printData() {
		System.out.println("-----------------<<회원정보>>-----------------");
		System.out.println("이름\t등급\t포인트\t이자포인트");
		System.out.println("--------------------------------------------");
		
		for(int i = 0; i < index; i++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", 
							   members[i].getName(), members[i].getGrade(),
							   members[i].getPoint(), members[i].getEjaPoint());
		}
		
		printBuyInfo(price);
		
	}
	
	void printBuyInfo(int price) {
		System.out.println("--------------------------------------------");
		for(int i = 0; i < index; i++) {
			System.out.printf("%s등급회원 %s는 %d원 상품을 %d원에 구매합니다.%n",
					   members[i].getGrade(), members[i].getName(), 
					   price, members[i].buy(price));
		}
		System.out.println("--------------------------------------------");
		
	}

}

