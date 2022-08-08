package com.uni.section1.extend;

public class FireCar extends Car {

	public FireCar() {
		System.out.println("FireCar 클래스 기본 생성자 호출");
	}
	/* @Override 어노테이션
	    * JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
	    * (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
	    * */
	@Override
	public void soundHorn() {
		if(isRunning()) {
			System.out.println("(굉장히 우렁차게) 빵빵");
		}else {
			System.out.println("다 부수고 들어가도 합법이지만 지금 비킨다면 목숨은 살려드릴게");
		}
	}
	
	 public void sprayWater() {
		 System.out.println("꼬부기 발사");
	 }
	
}
