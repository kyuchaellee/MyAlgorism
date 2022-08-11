package com.uni.section1;

import java.util.Scanner;

public class A_UncheckException {
	// 예외 처리 : 예외가 발생했을 때 처리하는 구문을 작성해놓는것!
    /*
     * * try catch 방법
     * 
     * try {
     *       예외가 발생될 수 있는 구문;
     * 
     * }catch(발생될예외클래스 매개변수) {
     *       해당 예외가 발생되는 경우 처리할 구문;
     * 
     * }
     */
	   private Scanner sc = new Scanner(System.in);
	   public void method1(){
		   
		   System.out.println("정수 : ");
		   int num1 = sc.nextInt();
		   
		   System.out.println("정수 2 : ");
		   int num2 = sc.nextInt();
		   
		   int result = 0;
		   if(num2!=0) {
			   result = num1/num2;
		   }
		   
		   System.out.println("result :" + result);
		   
		   int result1 = 0;
		   
		   
		   try {
			   result1 = num1/num2;
		   }catch(ArithmeticException e){
			   System.out.println("0으로 나눌 수 없습니다.");
		   }
		   
	   }
	   
	   
	   public void method2(){
		   System.out.println("배열의 길이");
		   int num = sc.nextInt();
//		   int arr[] = new int[num];
		   
		   if(num>0) {
			   int arr[] = new int[num];
		   }else {
			   System.out.println("양수를 입력하세요.");
		   }
		   
		   try {
			   int arr[]=new int[num];
		   }catch(NegativeArraySizeException e) {
			   System.out.println("양수를 입력하셈.");
		   }
	   }
	 
	   public void method3() {
		   try {
		   Object obj = 'a';
//		   String str = (String) obj;
		   String str = String.valueOf(obj);
		   
		   int arr[] = new int [3];
		   arr[0]=1;
		   arr[1]=2;
		   arr[2]=3;
		   int lengh = str.length();
//		   }catch(ClassCastException e) {
//			   System.out.println("형변환 에러, 다형성 복습.");
//		   }catch(ArrayIndexOutOfBoundsException e) {
//			   System.out.println("에러~ 배열 인덱스 에러..");
//		   }catch(NullPointerException e) {
//			   System.out.println("에러~ 배열 인덱스 에러..");
		   }catch(ClassCastException|ArrayIndexOutOfBoundsException|NullPointerException e) {
			   System.out.println("가지가지 나뭇가지 한 에러");
			   e.printStackTrace(); // 유형 +에러메세지 + 경로
			   System.out.println(e.getMessage()); //error message
			   System.out.println(e.toString()); // type + error message
			   System.exit(0);
		   }finally {
			   System.out.println("여전히 실행 || 반드시 실행 해야되는 구문.");
		   }
		   System.out.println("프로그램 종료 컽컽컼ㅌ");
	}
	   
}
