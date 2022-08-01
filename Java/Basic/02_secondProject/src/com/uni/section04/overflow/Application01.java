package com.uni.section04.overflow;

public class Application01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*오버 플로우 -- 자료형 별 값의 최대 범위를 벗어나는 경우*/
		
		byte num1=127; // -128~127까지
		
		System.out.println("num1 :"+num1); // byte 자료형 최대 저장 범위 127
		num1++;
		System.out.println("num1 :"+num1);  
		
		
        /*언더 플로우 -- 자료형 별 값의 최소 범위를 벗어나는 경우*/
		byte num2 = -128;
		System.out.println("num2 :"+num2); // byte 자료형 최소 저장 범위 -128
		num2--;
		System.out.println("num2 :"+num2); 
		
		
		num1 = 127;
		
		System.out.println(num1);
		byte result1 =(byte)(num1+3);
		System.out.println(result1);
		
		int firstNum = 100000000;
		int secondNum = 700000;
		
		int multi = firstNum + secondNum;
		
		System.out.println(multi);
		
		long longMulti = firstNum+secondNum;
		System.out.println(longMulti);
	}

}
