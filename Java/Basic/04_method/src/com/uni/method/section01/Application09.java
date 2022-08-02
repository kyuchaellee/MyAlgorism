package com.uni.method.section01;


public class Application09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 100;
		int second = 50;

		/* 1. non-static 메소드의 경우 */
		/*
		 * 클래스가 다르더라도 사용하는 방법은 동일하다 클래스명 사용할이름 = new 클래스명(); 사용할이름.메소드명();
		 */
		calculator calc = new calculator();
		int min = calc.minNumberOf(first, second);
		
		/* 2. static 메소드인 경우 */
	      /* 다른 클래스에 작성한 static 메소드의 경우 호출할 때 클래스명을 반드시 기술해야 한다. 
	       * 클래스명.메소드명();
	       * */
		//maxNumberOf 는 다른 클래스이기 때문에 에러
		int max = calculator.maxNumberOf(first, second);
		
		System.out.println("최솟값 : " + min);
		System.out.println("최댓값 : " + max);
		
		/* 주의! 
	       * static 메소드도 non-static 메소드처럼 호출은 가능하다.
	       * 하지만 권장하지 않는다. (이유는 차차 알게 될 것이다.)
	       * 이미 메모리에 로딩되어 있는 static 메소드는 여러 객체가 공유하게 된다.
	       * 그 때 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못하는 동작을 유발할 수 있기 때문에
	       * 사용을 제한해 달라는 경고이다. 시스템이 복잡해질 수록 이런 에러를 찾기 힘들어지기 때문에 하지 말라면 하지 말자!!
	       * */
		//static 메소드는 static에 접근하는 방법을 사용하라고 경고가 나온다. 하지마!!!
//		int max2 = calc.maxNumberOf(first, second); static 은 객체 생성 이전에 이미 공통으로 쓸 수 있게 되있다.
	}
}
