package com.uni.method.section01;

public class Application08 {

	public static void main(String[] args) {
		int first = 20;
		int second = 10;
		int sum = sumTwoNumbers(first,second);
		System.out.println("10+20의 합 : " + Application08.sumTwoNumbers(first, second) );
		// 동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능하다.
		System.out.println("10+20의 합 : " + sumTwoNumbers(first, second) );

	}
	
	//static 메소드
	public static int sumTwoNumbers(int first,int second) {
		return (first+second) ;
	}
}
