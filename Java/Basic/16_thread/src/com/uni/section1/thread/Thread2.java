package com.uni.section1.thread;
//2 Runnable 인터페이스 구현
// 단일 상속만 지원하기 때문에 Thread 클래스를 상속받지 못하는 경우 Runnable 로 구현
public class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println("ㅅ레드 2 [ " +i + " ] %%%%%%%%%%%%%^");
		}
	
	}
}
