package com.uni.section01.conditional;

import java.util.Scanner;

public class D_switch {
	public void testSimpleSwitchStatement() {
		/*
		 * [switch문 표현식] switch(비교할변수) { case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break; case
		 * 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break; default : case에 모두 해당하지 않는 경우 실행할 구문;
		 * break; }
		 */

		/*
		 * 여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사하다. 따라서 일부 호환이 가능하다. 하지만,
		 * switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다. 실수와 논리는 비교할 수 없다. 또한 정확하게 일치하는 경우만
		 * 비교할 수 있으며 대소비교를 할 수 없다는게 차이점이다. case절에는 변수를 사용하지 못한다. (값만 비교 가능) 또한, 문자열 비교는
		 * jdk 1.7 이상부터 가능하다.
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫 번째 정수 입력 : ");
//		int first = sc.nextInt();
//		System.out.print("두 번째 정수 입력 : ");
//		int second = sc.nextInt();
//		System.out.print("연산 기호 입력(+, -, *, /, %) : ");
//		char op = sc.next().charAt(0);
//
//		int result = 0;
//		switch (op) {
//		case '+':
//			result = first + second;
//			break;
//		case '-':
//			result =first - second;
//			break;
//		case '*':
//			result = first * second;
//			break;
//		case '/':
//			result = first /second;
//			break;
//		case '%' :
//			result = first % second;
//			break;
//		default : break;
//		}
//		System.out.println(first + " " + op + " " + second + " = "+result);
		

	      /* switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트 */
	      /* 1. JDK 1.7 이상부터 switch문을 이용하여 문자열을 비교할 수 있다. 
	       * 2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다. */
	      
	      /* switch문을 이용한 간단한 자판기 */
	      System.out.println("=== OhGiraffers vending machine ===");
	      System.out.println("  사이다   콜라   환타   바카스  핫식스  ");
	      System.out.println("==============================");
	      System.out.print("음료를 선택해주세요 : ");
	      
	      /* 원하는 음료를 문자열로 입력받음 */
	      Scanner sc = new Scanner(System.in);
	      String selectedDrink = sc.nextLine();
	      
	      /* 원하는 음료에 맞는 가격을 저장할 변수 */
	      int price = 0;
	      /* 선택한 메뉴에 따라 구문이 출력은 된다. (문자열 비교 가능함) */
	      /* 하지만 한 개의 메뉴를 선택해도 그 메뉴 이후의 메뉴가 전부 선택이 되는 이상한 자판기가 되었다. 
	       * 가격 또한 음료별로 다르지만 마지막 메뉴 가격인 10000원으로 고정되어 있다.
	       * */
	      switch(selectedDrink) {
	         case "사이다" :
	            System.out.println("사이다를 선택하셨습니다.");   // String order 에 내용 집어넣고 출려문 밑에서 한번에 처리하는게 더 깔끔함.
	            price = 500;
	            break;
	         case "콜라" : 
	            System.out.println("콜라를 선택하셨습니다.");
	            price = 600;
	            break;
	         case "환타" : 
	            System.out.println("환타를 선택하셨습니다.");
	            price = 700;
	            break;
	         case "바카스" : 
	            System.out.println("바카스를 선택하셨습니다.");
	            price = 2000;
	            break;
	         case "핫식스" : 
	            System.out.println("핫식스를 선택하셨습니다.");
	            price = 10000;
	            break;
	         default :
	        	 System.out.println("잘못 입력햇습니당");
	        	 return;
	      }
	      
	      System.out.println(price + "원을 투입해주세요!");

		
		
		sc.close();
	}
	
	public void monthss() {
		//1~12월 까지 입력받아 해당하는 달의 마지막 날짜를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 월이 궁금하세연?");
		int month = sc.nextInt();
		int day = 0;
		switch(month) {
		case 1,3,5,7,8,10,12:
			day = 31;
			break;
		case 4,6,9,11:
			day = 30;
			break;
		default:
			day = 29;
		}
		System.out.println(month + "의 마지막 날은 " + day);
	}
}