package com.uni.section2.run;

import java.util.Scanner;

import com.uni.section2.exception.MyException;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요~ : ");

		int num = sc.nextInt();
		
		//checkNum 만들고
		//10 보다 작은 수 일 경우 MyException("10보다 작은수 입니다.") 발생
		// 아닌경우 sysout : 10보다 크거나 같은 수구나.
		try {
			checkNum(num);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void checkNum(int num) throws MyException {
		if(num<10) {
			throw new MyException("10보다 작은수 입니다.");
		}else {
			System.out.println("10보다 크거나 같은 수구나.");
		}
	}

}
