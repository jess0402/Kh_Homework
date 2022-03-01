package com.collection.list.book.controller;

import java.util.ArrayList;
import java.util.List;

import com.collection.list.book.model.vo.AscCategory;
import com.collection.list.book.model.vo.Book;

public class BookManager {
	List<Book> bookList;
	
	public BookManager() {
		super();
		bookList = new ArrayList<>();
	}

	public BookManager(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}
	
	// 리스트에 객체 추가
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	// 리스트에서 객체 제거
	public void deleteBook(int index) {
		bookList.remove(index);
	}
	
	// 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
	// 도서명일 일치하는 객체가 리스트에 없으면 -1을 리턴함
	public int searchBook(String title) {
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(title))
				return i;
		}
		return -1;
	}
	
	// 인덱스 위치의 객체의 정보를 출력함 
	public void printBook(int index) {
		String bNo = bookList.get(index).getbNo();
		int category = bookList.get(index).getCategory();
		String title = bookList.get(index).getTitle();
		String author = bookList.get(index).getAuthor();
		System.out.printf("%d. [도서번호: %s, 제목: %s, 저자: %s]%n", 
						   category, bNo, title, author);
	}
	
	// 목록정보 모두 출력 
	public void printAll() {
		for(Book b : bookList) {
			System.out.printf("%d. [도서번호: %s, 제목: %s, 저자: %s]%n", 
							   b.getCategory(), 
							   b.getbNo(), 
							   b.getTitle(), 
							   b.getAuthor());
		}
	}
	
	// 해당 카테고리순 오름차순 정렬해서 객체배열 리턴함 
	public Book[] sortedBookList() {
		Book[] bookArr = new Book[bookList.size()];	
		bookList.sort(new AscCategory());
		
		for(int i = 0; i < bookList.size(); i++)
			bookArr[i] = bookList.get(i);
		
		return bookArr;
		
	}
	
	// 객체배열 출력, for each문 사용
	public void printBookList(Book[] br) {
		for(Book b : br) {
			System.out.printf("%d. [도서번호: %s, 제목: %s, 저자: %s]%n", 
					   b.getCategory(), 
					   b.getbNo(), 
					   b.getTitle(), 
					   b.getAuthor());
		}
	}
	
	
	
	
	
	
	
}
