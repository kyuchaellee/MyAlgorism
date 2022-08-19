package com.uni.section6.race.run;

import com.uni.section6.race.thread.Heart;
import com.uni.section6.race.thread.Star;

public class Application {
	
	public static int tot1 = 0;
	public static int tot2 = 0;
	
	public static void main(String[] args) {
		Heart h = new Heart();
		Star s = new Star();
		
		Thread th1 = new Thread(h);
		Thread th2 = new Thread(s);
		
		
		try {
			th1.start();
			Thread.sleep(500);
			th2.start();
			
			th1.join(); //main쓰레드가 th1의 작업이 끝날때까지 대기
			th2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str = Application.tot1 >Application.tot2 ? "heart 승" : "star 승";
		System.out.println(str);
	}
}
