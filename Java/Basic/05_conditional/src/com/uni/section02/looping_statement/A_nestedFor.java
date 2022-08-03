package com.uni.section02.looping_statement;

import java.util.Scanner;

public class A_nestedFor {
	   public void printGugudanFromTwoToNine() {
		   /* 2단부터 단을 1씩 증가시키는 반복문 */
		   for(int i = 2;i<10;i++) {
			   for(int j=1;i<10;j++) {
				   System.out.println(i + " * "+ j +" = " + (i*j));
			   }
		   }
	   }
	   public void printStarInputRowTimes() {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("갯수 입력 :");
		   int row = sc.nextInt();
		   
		   for(int i = 1 ;i<=row;i++) {
//			   for(int j = 1;j<=i;j++) {
//				   System.out.print("*");
//			   }
			   printStar(i);
			   System.out.println();
		   }
	   }
	   public void printStar(int t) {
		   for(int j = 1; j<=t;j++) {
			   System.out.print("*");
		   }
	   }
}
