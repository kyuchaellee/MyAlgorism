package com.uni.section1.object.run;

import com.uni.section1.object.book.*;

public class Application {

	public static void main(String[] args) {
		Book book1 = new Book(1,"harryporter","jk",150000);
		Book book2 = new Book(1,"harryporter","jk",150000);
		Book book3 = new Book(2,"haaaaa","jkp",130000);
	
		// toString() 오버라이딩 전 : 인스턴스가 생성될 때 사용한 full class name과 @ 그리고 16진수 해쉬코드가 문자열 반환
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
	
		
		System.out.println(book1);
		System.out.println(book3);
		System.out.println(book2);
	}
}
