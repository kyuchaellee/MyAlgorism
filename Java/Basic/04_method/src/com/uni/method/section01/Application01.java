package com.uni.method.section01;

public class Application01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 메소드란? */
		/*
		 * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다. 자세한 메소드 사용법은 객체 부분에서 다루게 되니
		 * 지금은 호출 흐름에 대해 이해할 수 있도록 하자.
		 */
		System.out.println("main() 시작됨");

		Application01 app = new Application01(); // 객체 생성
		app.methodA();
		System.out.println("main() 시작됨");
	}

	public void methodA() {
		System.out.println("methodA() 호출됨");
		methodB();
		System.out.println("methodA() 종료됨");
	}
	
	public void methodB() {
		System.out.println("methodB() 호출됨");
		methodC();
		System.out.println("methodB() 종료됨");
	}
	
	public void methodC() {
		System.out.println("methodC() 호출됨");
		System.out.println("methodC() 종료됨");
	}

}
