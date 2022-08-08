package com.uni.section1.extend;

public class RacingCar extends Car {
	
	public RacingCar() {
		System.out.println("racing car 기본 생성자 호출");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("레이싱카가 전속력으로 질수");
	}

	@Override
	public void soundHorn() {
		System.out.println("노 빵빤 super ggabi");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Rldldldllㅣㅣㅣㅣ skrrrrr");
		}
}
		