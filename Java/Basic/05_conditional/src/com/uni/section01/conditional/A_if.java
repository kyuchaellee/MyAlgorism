package com.uni.section01.conditional;

import java.util.Scanner;

public class A_if {

	public static void main(String[] args) {
		/* [if문 표현식]
	       * if(조건식) {
	       *     조건식이 true일 때 실행할 명령문;
	       * }
	       * */
	      
	      /* 조건식 : true or false가 나오는 연산식을 조건식이라고 한다.
	       * 
	       * if문은 조건식의 결과 값이 참(true)이면 { } 안에 있는 코드를 실행하고,
	       * 조건식의 결과 값이 거짓(false)이면 { } 안에 있는 코드를 무시하고 넘어감
	       * */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("입력한 숫자는 짝수입니다.");
		}
		
		System.out.println("프로그램 종료함");
		
		sc.close();
	}
	public void testNestedIfStatement() {
		/* 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여 
	       * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력하고,
	       * 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자 
	       * 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
	       * */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 :");
		
		int num = sc.nextInt();
		if(num >=0) {
			if(num%2 == 0) {
				System.out.println("입력하신 숫자는 양수면서 짝수 입니다.");
			}
		}
		System.out.println("프로그램 종료");
		
		sc.close();
	}
}
