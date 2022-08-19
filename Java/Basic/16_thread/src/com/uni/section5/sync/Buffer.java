package com.uni.section5.sync;

public class Buffer {
	private int data;
	private boolean empty = true;
	
	public synchronized void getData() {
		
		//받아오기전 있는지
		while(empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		//받아오기
		System.out.println("소비자 : "+ data + "번 상품을 소비하였습니다.");
		empty= true;
		notify();
	}
	
	public synchronized void setData(int data) {
		
		//생성하기 전 비어잇는지
		while(!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//생성
		this.data = data;
		System.out.println("생상자 : " + data + "번 상품을 생산하였습니다.");
		empty = false;
		notify();
	}
}
