package com.thread.sleep;

public class SleepTest {
	public static void main(String[] args) {
		SleepTest hw = new SleepTest();
		hw.sendAphorism();
	}
	
	public void sendAphorism() {
		String[] aphorism = new String[10];
		
		aphorism[0] = "People call it love, while I be calling you ";
		aphorism[1] = "Tomorrow is another day";
		aphorism[2] = "낮말은 새가 듣고 밤말은 쥐가 듣는다";
		aphorism[3] = "돌다리도 두드려 보고 건너라";
		aphorism[4] = "Carpe Diem";
		aphorism[5] = "Great power always comes with Great responsibility";
		aphorism[6] = "화향백리 인향만리";
		aphorism[7] = "쇠뿔도 단김에 빼랬다";
		aphorism[8] = "원숭이도 나무에서 떨어진다";
		aphorism[9] = "천리길도 한걸음부터";
		
		for(int i = 0; i < 10; i++) {
			int j = (int)(Math.random() * 10);
			System.out.println(aphorism[j]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
