package com.uni.section1.poly;

public class Rabbit extends Animal{

	@Override
	public void eat() {
		System.out.println("토끼가 풀을 뜯어 먹고  잇스므니다.");
	}

	@Override
	public void run() {
		System.out.println("깡총");
	}

	@Override
	public void cry() {
		System.out.println("come on m**k");
	}
	
	public void jump() {
		System.out.println("번지 점프 장인");
	}

}
