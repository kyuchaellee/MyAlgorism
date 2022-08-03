package com.uni.method.section03.math;

public class Application01 {

	public static void main(String[] args) {
		/*
		 * API란? Application Programming Interface는 응용프로그램에서 사용할 수 있도록, 운영체제나 프로그래밍 언어가
		 * 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다. 쉽게 말해 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 JDK를
		 * 설치하면 사용할 수 있도록 제공해놓은 소스코드(클래스나 인터페이스)들을 의미한다. 더 쉽게 말해 누가 작성해놓은 소스코드이니 가져다 쓰는
		 * 방법을 본다는 말이다. 모든 코드를 우리가 다 외울 수 없으니 API 문서를 별도로 제공해주고 있다.
		 */
		// https://docs.oracle.com/en/java/javase/11/docs/api/index.html
		/* 절대값 */
		System.out.println("-7 : " + (java.lang.Math.abs(-7)));
		/* java.lang.Math */
		/*
		 * Math 클래스는 수학에서 자주 사용하는 상수들과 함수 들을 미리 구현해놓은 클래스 이다. API문서 보는거 설명하면서 static
		 * member로만 구성되어 있는 것을 보여준다. 다른 클래스에 정의된 static 메소드호출을 할 수 있을 것이다.
		 */
		System.out.println("-7 : " + Math.abs(-7));

		System.out.println("최대 : " + Math.max(10, 20) + " 최솟값 : " + Math.min(10, 20));

		System.out.println("난수 발생: " + Math.random());
		/* 난수의 활용 */
		/*
		 * Math.random()을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 난수값을 반환한다. 필요에 따라 정수 형태의 값을 원하는
		 * 범위 만큼 발생시켜야 하는 경우들이 존재하는데 필요한 범위까지의 난수를 발생시켜보자.
		 */

		/*
		 * 원하는 범위의 난수를 구하는 공식 (int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
		 */
		int random = (int)(Math.random()*10);
		System.out.println(random);
		
		/*1-10 까지*/
		int random2 = (int)(Math.random()*10)+1;
		System.out.println(random2);
		/*10-15*/
		int random3 = (int)(Math.random()*6)+10;
		System.out.println(random3);
		
		/* -128 ~ 127*/
		int random4 = (int)(Math.random()*256)-128;
		System.out.println(random4);
	}

}
