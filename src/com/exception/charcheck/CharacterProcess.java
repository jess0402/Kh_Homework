package com.exception.charcheck;

public class CharacterProcess {
	
	public CharacterProcess() {
		super();
	}
	
	public int countAlpha(String s) {
		
		int cnt = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
				cnt++;
			if(ch==' ')
				throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
		}
		return cnt;
	}

}
