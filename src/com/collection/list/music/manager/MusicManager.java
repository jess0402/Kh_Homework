package com.collection.list.music.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.collection.list.music.vo.Music;

/**
 * Music 관리자 클래스 
 * @author jes
 *
 */
public class MusicManager {
	
	private List<Music> musicList = new ArrayList<>();
	
	{
		musicList.add(new Music("한숨","이하이"));
		musicList.add(new Music("너였다면","정승환"));
		musicList.add(new Music("Bounce","조용필"));
		musicList.add(new Music("열정","코요테"));
		musicList.add(new Music("Hello","World"));
		musicList.add(new Music("Party","sik-k"));
	}

	
	// 1. 음악리스트 리턴
	public List<Music> selectList(){
		return this.musicList;
	}
	
	// 2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드. 
	public void addList(Music m) {
		this.musicList.add(m);
	}
	
	// 3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
	public void addAtZero(Music m) {
		this.musicList.add(0, m);
	}
	
	// 4. 특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제), 삭제여부를 리턴
	public boolean removeMusic(String song) {
		for(int i = 0; i < musicList.size(); i++) {
			if(song.equals(musicList.get(i).getTitle())) {
				musicList.remove(i);
				return true;
			}
		}
		return false;
	}
	
	// 5. 특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체), 교체 성공여부를 리턴
	// set 사용
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		
		for(int i = 0; i < musicList.size(); i++) {
			if(musicList.get(i).equals(oldMusic)) {
				musicList.set(i, newMusic);
				return true;
			}
		}
		return false;
	}
	
	// 6. 특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음. 
	// (곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를 출력하고, 없다면, "검색결과가 없습니다"출력)
	public List<Music> searchMusicByTitle(String title) {
		List<Music> searchMusic = new ArrayList<>();
		
		for(int i = 0; i < musicList.size(); i++) {
			if(musicList.get(i).getTitle().contains(title)) {
				searchMusic.add(musicList.get(i));
			}
		}
		
		if(searchMusic.isEmpty()) {
			System.out.println("검색결과가 없습니다.");
			return searchMusic;
		}
		else {
			for(Music m : searchMusic)
				System.out.println("곡명: " + m.getTitle() + " 가수: " + m.getSinger());
			
			return searchMusic;
		}
	}
	
	// 7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
	public List<Music> searchMusicBySinger(String singer) {
		List<Music> searchSinger = new ArrayList<>();
		for(int i = 0; i < musicList.size(); i++) {
			if(musicList.get(i).getSinger().contains(singer)) {
				searchSinger.add(musicList.get(i));
			}
		}
		
		if(searchSinger.isEmpty()) {
			System.out.println("해당 가수의 노래가 없습니다.");
			return searchSinger;
		} 
		else {
			for(Music m : searchSinger) {
				System.out.println("곡명: " + m.getTitle() + " 가수: " + m.getSinger());
			}
			return searchSinger;
		}
	}
	
	// 8. 서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
	public List<Music> orderBy(Comparator<Music> c) {
		
		List<Music> musicList = (List<Music>)((ArrayList<Music>) this.musicList).clone();
		musicList.sort(c);
		return musicList;
	
	}
}
