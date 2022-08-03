package com.uni.method.section03.math;
import java.util.Random; //ctrl shift o

public class Application03 {

	public static void main(String[] args) {
		/* java.util.Random 클래스 */
		/*
		 * java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생 nextInt(int bound) : 0부터 매개변수로
		 * 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환
		 */

		/*
		 * 원하는 범위의 난수를 구하는 공식 random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
		 */
	Random random = new Random();
	
	//0~9
	int random5 = random.nextInt(10);
	System.out.println(random5);
	
	/*1-10 까지*/
	int random2 = random.nextInt(10)+1;
	System.out.println(random2);
	/*10-15*/
	int random3 = random.nextInt(5)+10;
	System.out.println(random3);
	
	/* -128 ~ 127*/
	int random4 = random.nextInt(256)-128;
	System.out.println(random4);
	}

}
