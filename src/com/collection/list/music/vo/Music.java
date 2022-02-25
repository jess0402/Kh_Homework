package com.collection.list.music.vo;

import java.util.Objects;

/**
 * VO클래스
 *
 */

public class Music implements Comparable<Music>{
	private String title;
	private String singer;
	
	public Music() {
		super();
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

	@Override
	public int compareTo(Music o) {
		return this.singer.compareTo(o.singer);  // 곡명 오름차순
	}
	
	@Override
	public boolean equals(Object obj) {
		Music other = (Music) obj;
		if(this.singer.equals(other.singer) && this.title.equals(other.title))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.title, this.singer);
	}
	
	
}
