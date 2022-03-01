package com.collection.list.book.model.vo;

import java.util.Comparator;

public class AscCategory implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return Integer.valueOf(o1.getCategory()).compareTo(Integer.valueOf(o2.getCategory()));
	}
	

}
