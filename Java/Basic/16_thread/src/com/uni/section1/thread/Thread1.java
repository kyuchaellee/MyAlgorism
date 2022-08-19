package com.uni.section1.thread;

//1. thread 상속받기
public class Thread1 extends Thread{

	@Override
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println("ㅅ레드 1 [ " +i + " ] ");
		}
	}
}
