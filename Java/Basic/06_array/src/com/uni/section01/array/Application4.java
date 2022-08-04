package com.uni.section01.array;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5명의 자바 점수를 정수로 입력받아서 합계의 평균을 실수로 구하는 프로그램*/
		Scanner sc = new Scanner(System.in);
		int[] java = new int[5];
		int sum = 0;
		
		for(int i = 0;i<java.length;i++) {
			System.out.print("숫자 : ");
			java[i] = sc.nextInt();
		}
		for(int i = 0;i<java.length;i++) {
			sum += java[i];
		}
		
		double avg = 0.0;
		avg = sum/5.0;
		System.out.println(avg);
	}
}
