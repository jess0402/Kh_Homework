package com.collection.map.book.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.collection.list.book.model.vo.Book;

public class MapBookManager {
	
Map<String, Book> booksMap;

	
	public MapBookManager() {
		super();
		booksMap = new HashMap<>();
	}


	public MapBookManager(Map<String, Book> bookMap) {
		super();
		this.booksMap = bookMap;
	}


	// 리스트에 객체 추가
	public void putBook(Book book) {
		String key = book.getbNo();
		booksMap.put(key, book);
	}
	
	// 리스트에서 객체 제거
	public void deleteBook(String key) {
		booksMap.remove(key);
	}
	
	// 도서명이 일치하는 객체를 찾아 해당 도서번호를 리턴
	// 도서명이 일치하는 객체가 리스트에 없으면 null을 리턴함
	public String searchBook(String title) {
		Set<Map.Entry<String, Book>> entrySet = booksMap.entrySet();
		for(Map.Entry<String, Book> entry : entrySet) {
			if(entry.getValue().getTitle().contains(title))
				return entry.getKey(); 
		}
		return null;

	}
	
	// 목록정보 모두 출력 
	public void displayAll() {
		Set<String> keySet = booksMap.keySet();
		for(String key : keySet) {
			System.out.printf("%d. [도서번호: %s, 도서명: %s, 저자: %s]%n", 
								booksMap.get(key).getCategory(),
								booksMap.get(key).getbNo(),
								booksMap.get(key).getTitle(),
								booksMap.get(key).getAuthor()); 

		}
	}
	
	// 해당 도서명순 오름차순 정렬해서 객체배열 리턴함 
	public Book[] sortedBookMap() {
		Book[] bookArr = new Book[booksMap.size()];
		List<Map.Entry<String, Book>> entryList = new ArrayList<>(booksMap.entrySet());
		
		entryList.sort(new Comparator<Map.Entry<String, Book>>() {
	    @Override
	    public int compare(Map.Entry<String, Book> o1, Map.Entry<String, Book> o2) {
		return o1.getValue().getTitle().compareTo(o2.getValue().getTitle());
	    }
	});
		
		int i = 0;
		for(Entry<String, Book> entry : entryList){
		    bookArr[i++] = entry.getValue();
		}
		
		return bookArr;
		
		
	}
	
	// 객체배열 출력, for each문 사용
	public void printBookMap(Book[] br) {
		for(Book b : br) {
			System.out.printf("%d. [도서번호: %s, 제목: %s, 저자: %s]%n", 
					   b.getCategory(), 
					   b.getbNo(), 
					   b.getTitle(), 
					   b.getAuthor());
		}
	}
	
	// 인덱스 위치의 객체의 정보를 출력함 
	public void printBook(String key) {
		String bNo = booksMap.get(key).getbNo();
		int category = booksMap.get(key).getCategory();
		String title = booksMap.get(key).getTitle();
		String author = booksMap.get(key).getAuthor();
		System.out.printf("%d. [도서번호: %s, 제목: %s, 저자: %s]%n", 
						   category, bNo, title, author);
	}
	

	
}
