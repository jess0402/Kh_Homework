package com.collection.list.book.model.vo;

import java.util.Comparator;
import java.util.Objects;

import com.collection.list.music.vo.Music;

public class Book implements Comparable<Book> {
	private String bNo;
	private int category;  // 도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
	private String title;
	private String author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bNo, int category, String title, String author) {
		super();
		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;
	}

	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bNo=" + bNo + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}



	@Override
	public int compareTo(Book o1) {
		return this.title.compareTo(o1.title);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(obj instanceof Book)
			return false;
		
		Book other = (Book) obj;
		if(bNo==null) {
			if(other.bNo != null)
				return false;
		} else if(!bNo.equals(other.bNo))
			return false;
		
		if(category != other.category)
			return false;
		
		if(title==null) {
			if(other.title != null)
				return false;
		} else if(!title.equals(other.title))
			return false;

		if(author==null) {
			if(other.author != null)
				return false;
		} else if(!author.equals(other.author))
			return false;
		
		return true;

	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.bNo, this.category, this.title, this.author);
	}
	
	
	
	
}
