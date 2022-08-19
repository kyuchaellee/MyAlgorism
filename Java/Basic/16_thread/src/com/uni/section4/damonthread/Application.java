package com.uni.section4.damonthread;

import javax.swing.JOptionPane;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new CountDown();
		t.setDaemon(true);
		t.start();
		
		System.out.println(JOptionPane.showInputDialog("아무문자나 입력하이소"));
		
		System.out.println("메인스레드 종료");
	}

}
