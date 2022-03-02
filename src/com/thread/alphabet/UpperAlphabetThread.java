package com.thread.alphabet;

public class UpperAlphabetThread implements Runnable {

	@Override
	public void run() {
		for(char alp = 'A'; alp <= 'Z'; alp++) {
			System.out.print(alp + " ");
		}
		
		System.out.println("[" + Thread.currentThread().getName() + "종료]");
	}

}
