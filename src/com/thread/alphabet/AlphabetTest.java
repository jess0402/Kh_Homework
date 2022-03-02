package com.thread.alphabet;

public class AlphabetTest {

	public static void main(String[] args) {
		
		new Thread(new LowerAlphabetThread(), "소문자 쓰레드").start();
		new Thread(new UpperAlphabetThread(), "대문자 쓰레드").start();
		
		System.out.println("[" + Thread.currentThread().getName() + "종료]");
	}

}
