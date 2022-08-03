package com.uni.section02.looping_statement;

import java.util.Scanner;

public class A_for {

	public void testSimpleForStatement() {
		// TODO Auto-generated method stub
		/* 반복문의 기본 흐름 테스트 */
	      
	      /* [for문 표현식]
	       * for(초기식; 조건식; 증감식) {
	       *     조건을 만족하는 경우 수행할 구문(반복할 구문);
	       * }
	       * */
	}
	public void testForStatement() {
		/* 무엇을 반복하는지를 확인하고, 반복문으로 개선해보기 */
	      
	      /* 10명의 학생 이름을 입력받아 이름을 출력해보자 */
	      /* 반복해야 할 내용이 무엇인지와 몇 번 반복해야 하는지를 확인해보자!! */
	      Scanner sc = new Scanner(System.in);
	      
//	      System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
//	      String student1 = sc.nextLine();
//	      System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
//	      
//	      System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
//	      String student2 = sc.nextLine();
//	      System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
//	      
//	      System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
//	      String student3 = sc.nextLine();
//	      System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
//	      
//	      System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
//	      String student4 = sc.nextLine();
//	      System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
//	      
//	      System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
//	      String student5 = sc.nextLine();
//	      System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");
//	      
//	      System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
//	      String student6 = sc.nextLine();
//	      System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");
//	      
//	      System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
//	      String student7 = sc.nextLine();
//	      System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
//	      
//	      System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
//	      String student8 = sc.nextLine();
//	      System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
//	      
//	      System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
//	      String student9 = sc.nextLine();
//	      System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
//	      
//	      System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
//	      String student10 = sc.nextLine();
//	      System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
//	      
//	      System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
	      
	      for(int i =1;i<=10;i++) {
	    	  System.out.print(i + " 번째 학생의 이름을 입력해주세요 : ");
		      String name = sc.nextLine();
		      System.out.println(i + " 번째 학생의 이름은 " + name + "입니다.");
	      }
	}
	public void testForExample() {
		int sum = 0;
		int i;
		for(i =1;i<=10;i++) {
			sum +=i;
		}
		System.out.println(sum);
	}
	public void testForExample2() {
		int ran = (int)(Math.random()*6)+5;
		int sum = 0;
		for(int i = 1;i<=ran;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public void testForExample4() {
		  /* 숫자 두 개를 입력 받아 작은 수 에서 큰 수까지의 합계를 구하세요 
	       * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결해본다. 
	       * */
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		int sum=0;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 == num2 ) {
			System.out.println("쯧");
		}else {
			if(num1>num2) {
				for(int i=num2;i<=num1;i++) {
					sum+=i;
				}
			}else {
				for(int i =num1;i<=num2;i++) {
					sum+=i;
				}
			}
		}
		System.out.println(sum);
	}
	      
	   public void printSimpleGugudan() {
		   /* 키보드로 2~9 사이의 구구단을 입력받아 
		    * 2~9 사이인 경우 해당 단의 구구단을 출력하고,
		    * 그렇지 않은 경우 "반드시 2~9 사이의 양수를 입력해야 합니다. 출력" */
		   
		   Scanner sc = new Scanner(System.in);
		   int num = sc.nextInt();
		   if(num <2 || num>9 ) {
			   System.out.println("반드시 2~9 사이값 입력하세연");
		   }else {
			   for(int i = 1;i<=9;i++) {
				   System.out.println(num + " * " +i +" = " + (num*i));
			   }
		   }
	   }   
}
