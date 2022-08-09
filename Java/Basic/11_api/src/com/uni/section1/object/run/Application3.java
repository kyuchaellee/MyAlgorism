package com.uni.section1.object.run;

import com.uni.section1.object.book.Book;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(1,"개미","베르나르",30000);
		Book book2 = new Book(1,"개미","베르나르",30000);
		
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
	}

}
