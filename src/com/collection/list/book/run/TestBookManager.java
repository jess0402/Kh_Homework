package com.collection.list.book.run;

import java.util.Scanner;

import com.collection.list.book.controller.BookManager;
import com.collection.list.book.model.vo.Book;

public class TestBookManager {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		TestBookManager hw = new TestBookManager();
		hw.menu();
		
	}
	
	public void menu() {
		BookManager manager = new BookManager();
		String menu = "*** 도서 관리 프로그램 ***\n"
					+ "1. 새 도서 추가\n"
					+ "2. 도서정보 정렬 후 출력\n"
					+ "3. 도서 삭제\n"
					+ "4. 도서 검색출력\n"
					+ "5. 전체 출력\n"
					+ "6. 끝내기\n"
					+ "**********************\n"
					+ "번호를 선택하세요 > ";
		
		while(true) {
			System.out.print(menu);
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: 
				Book b = inputBook();
				manager.addBook(b);
				break;
			case 2: 
				Book[] bookArr = manager.sortedBookList();
				manager.printBookList(bookArr);
				break;
			case 3: 
				int index = manager.searchBook(inputBookTitle());
				manager.printBook(index);
				manager.deleteBook(index);
				System.out.println("해당 도서를 삭제했습니다.");
				break;
			case 4: 
				index = manager.searchBook(inputBookTitle());
				manager.printBook(index);
				break;
			case 5: 
				manager.printAll();
				break;
			case 6: 
				return;
			}
		}
	}
	
	public Book inputBook() {

		System.out.print("도서 번호를 입력하세요: ");
		String bNo = sc.nextLine();
		
		System.out.print("도서 분류코드를 입력하세요(1.인문/2.자연과학/3.의료/4.기타): ");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목을 입력하세요: ");
		String title = sc.nextLine();
		
		System.out.print("도서 저자를 입력하세요: ");
		String author = sc.nextLine();
		
		return new Book(bNo, category, title, author);
		
	}
	
	public String inputBookTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("도서 제목를 입력하세요: ");
		return sc.nextLine();
	}

}
