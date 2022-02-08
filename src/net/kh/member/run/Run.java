package net.kh.member.run;

import net.kh.member.model.Member;

public class Run {

	public static void main(String[] args) {
		Member mm = new Member();
		
		mm.setMemberId("00000");
		mm.setMemberPwd("12345");
		mm.setMemberName("장은성");
		mm.setAge(24);
		mm.setGender('여');
		mm.setPhone("010-1234-1234");
		mm.setEmail("abcde@naver.com");
		
		System.out.println("**********정보**********");
		System.out.printf("아이디 : %s%n", mm.getMemberId());
		System.out.printf("비밀번호 : %s%n", mm.getMemberPwd());
		System.out.printf("이름 : %s%n", mm.getMemberName());
		System.out.printf("나이 : %d%n", mm.getAge());
		System.out.printf("성별 : %c자%n", mm.getGender());
		System.out.printf("전화번호 : %s%n", mm.getPhone());
		System.out.printf("이메일 : %s%n", mm.getEmail());
		
	}

}
