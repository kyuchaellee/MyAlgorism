package com.uni.section5.sync;


//공유값을 넣는 공급자(생산자) 클래스
public class Producer extends Thread {

	private Buffer criticalData;
	
	public Producer(Buffer buffer) {
		this.criticalData = buffer;
	}
	
	@Override
	public void run() {
		for(int i = 1;i<=10;i++) {
			criticalData.setData(i);
		}
	}

	
}
