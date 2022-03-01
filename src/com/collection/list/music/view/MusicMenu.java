package com.collection.list.music.view;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.collection.list.music.manager.MusicManager;
import com.collection.list.music.vo.Music;
import com.collection.list.music.vo.TitleAsc;

/**
 * view단 클래스 (사용자가 보게될 화면 담당)
 *  - 사용자에게 메뉴 시각화
 *  - 사용자에게 입력값 처리
 *  - manager객체의 메서드를 호출
 *  - 결과 출력
 *
 */
public class MusicMenu {
	Scanner sc = new Scanner(System.in);
	
	private MusicManager manager = new MusicManager();
	
	private String menu = "================ Music Playlist Menu ================\r\n"
						+ "1.목록보기\r\n"
						+ "2.마지막에 음악추가\r\n"
						+ "3.맨처음에 음악추가\r\n"
						+ "4.곡삭제\r\n"
						+ "5.곡변경\r\n"
						+ "6.곡명검색\r\n"
						+ "7.가수검색\r\n"
						+ "8.목록정렬(곡명오름차순)\r\n"
						+ "0.종료\r\n"
						+ "================================================================\r\n"
						+ ">> 메뉴선택 : ";
	
	public void mainmenu() {
		while(true) {
			System.out.print(menu);
			String choice = sc.next();
			
			List<Music> musicList = null;
			switch(choice) {
			case "0": return;  // 현재메서드를 호출한 곳으로 return
			case "1": 
				musicList = manager.selectList();  // List<Music> 가져오기
				printList(musicList); 			   // List<Music> 출력하기
				break;
			case "2": 
				manager.addList(inputMusic());
				break;
			case "3": 
				manager.addAtZero(inputMusic());
				break;
			case "4": 
				manager.removeMusic(inputTitle());
				break;
			case "5": 
				System.out.println("교체할 음악을 입력하세요.");
				Music musicbefore = inputMusic();
				System.out.println("새로운 음악을 입력하세요.");
				Music musicafter = inputMusic();
				manager.replaceMusic(musicbefore, musicafter);
				break;
			case "6": 
				String song = inputTitle();
				manager.searchMusicByTitle(song);
				break;
			case "7": 
				String singer = inputSinger();
				manager.searchMusicBySinger(singer);
				break;
			case "8": 
				orderMusic();
				break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	private void printList(List<Music> musicList) {
		for(Music music : musicList) {
			System.out.println(music.getTitle() + " " + music.getSinger());
		}
	}
	
	private String inputTitle() {
		sc.nextLine();
		System.out.print("노래 제목을 입력하세요: ");
		String title = sc.nextLine();
		return title;
	}
	
	private String inputSinger() {
		sc.nextLine();
		System.out.print("가수를 입력하세요: ");
		String singer = sc.nextLine();
		return singer;
	}
	
	private Music inputMusic() {
		sc.nextLine();
		System.out.print("노래 제목을 입력하세요: ");
		String title = sc.nextLine();
		System.out.print("가수를 입력하세요: ");
		String singer = sc.nextLine();
		
		return new Music(title, singer);
	}
	
	private void orderMusic() {
		Scanner sc = new Scanner(System.in);
	      String menu = "    ================== 정렬 메뉴 ===================\r\n"
	               + "   1. 가수명 오름차순\r\n"
	               + "   2. 가수명 내림차순\r\n"
	               + "   3. 곡명 오름차순\r\n"
	               + "   4. 곡명 내림차순\r\n"
	               + "   5. 메인메뉴 돌아가기\r\n"
	               + "   ================================================\n"
	               + "정렬 메뉴를 선택하세요: ";


	      
	      while(true) {
	    	  System.out.print(menu);
		      String choice = sc.next();
		      
		      switch(choice) {
		      case "1": 
		    	  printList(manager.orderBy(null));
		    	  break;
		      case "2": 
		    	  printList(manager.orderBy(Collections.reverseOrder()));
		    	  break;
		      case "3": 
		    	  printList(manager.orderBy(new TitleAsc()));
		    	  break;
		      case "4": 
		    	  printList(manager.orderBy(Collections.reverseOrder(new TitleAsc())));
		      case "5": return;
		      default: System.out.println("잘못 입력하셨습니다.");
		      }
	      }
	}
	
 }
