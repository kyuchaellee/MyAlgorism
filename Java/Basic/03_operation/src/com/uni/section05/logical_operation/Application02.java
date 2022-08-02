package com.uni.section05.logical_operation;

public class Application02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 논리 연산자의 우선순위와 활용 */
		/*
		 * 논리 and 연산자와 논리 or 연산자의 우선선위 && : 11순위 || : 12순위 논리 and 연산자 우선순위가 논리 or 연산자
		 * 우선순위보다 높다
		 */

		int x = 3;
		int y = 10;

		System.out.println(y >= 5 || x < 0 && x > 2); // true

		/* 1. 1부터 100 사이의 값인지 확인 */
		/* 1 <= 변수 <= 100 이렇게는 사용 못함 --> 변수 >= 1 && 변수 <= 100 이렇게 사용해야 한다. */
		int num1 = 55;
		System.out.println("1부터 100 사이의 값인지 확인 : " + (num1 >= 1 && num1 <= 100));

		int num2 = 166;
		System.out.println("1부터 100 사이의 값인지 확인 : " + (num2 >= 1 && num2 <= 100));

		/* 2. 영어 대문자인지 확인 */
		/* 영어 대문자냐? --> 문자변수 >= 'A' && 문자변수 <= 'Z' */
		char ch ='A';
		System.out.println("ch 대문자인지 화긴 : " + (ch>= 'A' && ch <= 'Z'));
		
		char ch2 ='a';
		System.out.println("ch2 대문자인지 화긴 : " + (ch2>= 'A' && ch2 <= 'Z'));
		
		/* 영문자 y인지 확인 해라*/
		char ch3 = 'Y';
		char ch4 ='y';
		
		System.out.println("y인지 화긴 해라 대소문자 구분 없이 : " + (ch3 == 'y' || ch3 == 'Y') );
		System.out.println("y인지 화긴 해라 대소문자 구분 없이 : " + (ch4 == 'y' || ch4 == 'Y') );
		
		
		/* 영문자인지 확인 */
		char ch5 = 'f';
		char ch6 = 'F';
		System.out.println("영문자인지 : " + (ch5>='A' && ch5 <='Z' || ch5>='a' && ch5 <='z'));
		System.out.println("영문자인지 : " + (ch6>='A' && ch6 <='Z' || ch6>='a' && ch6 <='z'));
		
		/* A : 65, Z : 90, a : 97, z : 122 (중간에 91 ~ 96까지는 영문자가 아님) */
	      /* 연산자 우선순위를 고려한다면 논리 and 연산이 먼저 수행되기 때문에 괄호는 묶지 않아도 된다.
	       * 하지만 연산자 우선순위를 디테일하게 학습하고 개발하는 개발자가 적은 현실로 인해
	       * 논리적으로 먼저 실행하는 내용을 괄호로 묶어 주는게 좋다.
	       * */
	}

}
