package com.uni.method.section01;

public class Application07 {

	public static void main(String[] args) {
		Application07 app7 = new Application07();
		int first,second;
		first = 20;
		second = 10;
		System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first, second));
		System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumbers(first, second));
		System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumbers(first, second));
		System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNumbers(first, second));
	}
	
	public int plusTwoNumbers(int first,int second){return (first+second);};
	public int minusTwoNumbers(int first,int second){return (first-second);};
	public int multipleTwoNumbers(int first,int second){return (first * second);};
	public int divideTwoNumbers(int first,int second){return (first/second);};

}
