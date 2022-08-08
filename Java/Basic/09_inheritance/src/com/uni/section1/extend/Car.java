package com.uni.section1.extend;

public class Car {

	
	private boolean runningStatus;
	
	public Car() {
		System.out.println("CAr 기본 생성자 호출");
	}
	
	public void run() {
		runningStatus = true;
	}
	
	public void soundHorn() {
		if(isRunning()) {
			System.out.println("빵빵");
		}else {
			System.out.println("주행 중이 아닌데 와이 빵빵 노 안됨.");
		}
	}
	
	protected boolean isRunning() {
		return runningStatus;
	}
	
	public void stop() {
		runningStatus = false;
		System.out.println("자동차가 멈췃스므니다.");
	}
}
