package com.uni.section3.thread;

public class Thread4 implements Runnable {
	//sleep() 지정한 시간마큼 스레드를 정지시키는 메소드(static)
	@Override
	public void run() {
		int cnt = 0;
		
		while(cnt<10) {
			try {
				Thread.sleep(1000);
				System.out.println(++cnt+" 초");
			} catch (InterruptedException e) {
				System.out.println("에러우 ㅇ네러우 에러");
				System.out.println(cnt + "초에 카운트 종료");
				cnt = 10;
			}
		}
		System.out.println("종료");
	}
}
