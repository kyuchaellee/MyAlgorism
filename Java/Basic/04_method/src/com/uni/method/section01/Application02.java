package com.uni.method.section01;

public class Application02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application02 app = new Application02();
		
		
		System.out.println("main() 시작");
		app.A();
		app.B();
		app.c();
		System.out.println("main() 종료");
	}
	
	public void A() {
		System.out.println("A 시작 과 동시에 멸망띠");
	}
	public void B() {
		System.out.println("B시작과 동시에 멸망띠");
	}
	public void c() {
		System.out.println("C시작과 동시에 멸망띠");
	}
	

}
