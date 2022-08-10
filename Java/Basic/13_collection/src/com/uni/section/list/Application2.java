package com.uni.section.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.uni.section.list.comparator.AscendingPrice;
import com.uni.section.list.dto.BookDTO;

public class Application2 {

	public static void main(String[] args) {
		List<BookDTO> bookList = new ArrayList<BookDTO>();
		
		bookList.add(new BookDTO(1,"harrykane","sonny",56000));
		bookList.add(new BookDTO(2,"harrykkanne","holand",16000));
		bookList.add(new BookDTO(3,"harrykkkane","boom",52000));
		bookList.add(new BookDTO(4,"harrykkkkane","duri",36000));
		bookList.add(new BookDTO(5,"harrykkkkkane","ox",46000));
	
		for(BookDTO book : bookList) {
			System.out.println(book.toString());
		}
		
//		Collections.sort(bookList);     -- 안됨. BookDTO에서 따로 뭐 해줘야됨 쓸거면.
		/* 제네릭의 타입 제한에 의해 Comparable 타입을 가지고 있는 경우에만 sort가 사용 가능하다.*/
		bookList.sort(new AscendingPrice());
		System.out.println("가격 오름차순으로 정렬 후 ==============");
		for(BookDTO book : bookList) {
			System.out.println(book.toString());
		}
		
//		bookList.sort(new Comparator<BookDTO>(){});  -- Comparator 은 인터페이스 이기때문에 바로 인스턴스 생성 불가.
		bookList.sort(new Comparator<BookDTO>() {
			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				return o1.getPrice() >= o2.getPrice() ? -1 : 1;
			}
		});

		System.out.println("가격 내림차순 ====================");
		for (BookDTO book : bookList) {
			System.out.println(book);
		}

		bookList.sort(new Comparator<BookDTO>() {
			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});

		System.out.println("책 제목 순 ====================");
		for (BookDTO book : bookList) {
			System.out.println(book);
		}

		
		
		bookList.sort((BookDTO o1,BookDTO o2)->o2.getTitle().compareTo(o1.getTitle()));
		
		System.out.println("책 제목 내림 순 ====================");
		for (BookDTO book : bookList) {
			System.out.println(book);
		}
	}

}
