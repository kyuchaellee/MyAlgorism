package com.uni.section03;

public class A_break {
    /* break문은 반복문 내에서 사용한다.
     * 해당 반복문을 빠져 나올 때 사용하며, 반복문의 조건문 판단 결과와 상관 없이 반복문을 빠져나올 때 사용한다.
     * 일반적으로 if(조건식) { break; } 처럼 사용된다.
     * 단, switch문은 반복문이 아니지만 예외적으로 사용된다.
     * */
    
    /* break문을 이용하여 무란루프를 활용한 1~100까지 합계 구하기 */
	   public void testSimpleBreakStatement() {
		   int sum = 0;
		   int i = 1;
		   while(true) {
			   sum+=i;
			   if(i==100)
				   break;
			   i++;
		   }
		   System.out.println("1~100까지 합 : " + sum);
	   }
	   
	   /* 중첩 반복문 내에서 분기문의 흐름 */
	      /* break는 모든 반복문을 종료하는 것이 아닌, 자신에게 가장 인접한 반복문 실행만 멈춘다. */
	      
	      /* 구구단 2~9단까지 출력
	       * 단 각 단의 수가 5보다 큰 경우는 출력을 생략한다.
	       * */
	   public void testSimpleBreakStatement2() {
		   for(int i = 2;i<10;i++) {
			   for(int j = 1;j<10;j++) {
				   if(j>5)
					   break;
				   System.out.println(i + " * " + j + " = " + (i*j));
			   }
			   System.out.println();
		   }
	   }
	   
	   public void testJumpBreak() {
		   
		   label:
		   for(;;) {
			   for( int i = 0; i <10; i++) {
				   System.out.println(i);
				   if(i==3) {
					   break label;
				   }
			   }
		   }
	   }
	   
	   
	      /* continue문은 반복문 내에서 사용한다.
	       * 해당 반복문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다.
	       * 일반적으로 if(조건식) { continue; } 처럼 사용된다.
	       * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용된다.
	       * */
	      
	      /* 1부터 100 사이의 4의 배수이면서 5의 배수인 값 출력 */
	   
	   public void testSimpleContinueStatement() {
		   for (int i = 1;i<=100;i++) {
			   if(i%4!=0 || i%5 !=0)
				   continue;
			   System.out.println(i);
		   }
	   }
	   
	   
	   /* 구구단 2~9단까지 출력
	       * 단 각 단의 수가 짝수인 경우 출력을 생략한다.
	       * */
	   public void testSimpleContinueStatement2() {
		   
		   for(int i = 2;i<10;i++) {
			   for(int j = 1;j<10;j++) {
				   if(j%2 != 0) 
					   System.out.println(i + " * "+ j +" = " + (i*j));
				   
			   }
			   System.out.println();
		   }
	   }
	   
	 	   
}
