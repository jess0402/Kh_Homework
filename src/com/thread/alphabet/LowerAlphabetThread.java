package com.thread.alphabet;

public class LowerAlphabetThread implements Runnable {

	@Override
	public void run() {
		for(char alp = 'a'; alp <= 'z'; alp++) {
			System.out.print(alp + " ");
		}
		
		System.out.println("[" + Thread.currentThread().getName() + "종료]");
	}

}
