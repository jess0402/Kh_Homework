package com.io.test4.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.io.test4.model.vo.Book;

public class BookManager {
	
	Scanner sc = new Scanner(System.in);

	public BookManager() {
		super();
	}
	
	public void fileSave() {
		Book[] books = new Book[5];
		
		Calendar cal0 = Calendar.getInstance();
		cal0.set(2012, 8-1, 1);
		books[0] = new Book("잘못은 우리별에 있어", "존 그린", 12000, cal0);
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2018, 11-1, 26);
		books[1] = new Book("반상의 해바라기", "유즈키 유코", 15100, cal1);
		
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2020, 8-1, 19);
		books[2] = new Book("천개의 파랑", "천선란", 12600, cal2);
		
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2018, 3-1, 30);
		books[3] = new Book("아가미", "구병모", 11700, cal3);
		
		Calendar cal4 = Calendar.getInstance();
		cal4.set(2020, 8-1, 12);
		books[4] = new Book("살고 싶다는 농담", "허지웅", 14400, cal4);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("books.dat")))) {
			
			oos.writeObject(books);
			System.out.println("books.dat에 저장 완료!");
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}
	
	public void fileRead() {

		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("books.dat")))) {
			
			Book[] books2 = (Book[]) ois.readObject();
			
			for(Book b : books2) 
				System.out.println(b.toString());
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않습니다.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
