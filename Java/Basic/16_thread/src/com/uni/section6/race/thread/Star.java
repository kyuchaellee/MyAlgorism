package com.uni.section6.race.thread;

import com.uni.section6.race.run.Application;

public class Star implements Runnable {

	@Override
	public void run() {

		int run = 0;
		try {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 30; j++) { //// 콘솔창 개행(clear 용)

					System.out.println();

				}
				if (i == 0) {
					System.out.println("준비");
					System.out.println("♡");
					System.out.println("★");
				} else {
					run = (int) (Math.random() * 5) + 1;

					Application.tot2 += run;

					for (int k = 0; k < Application.tot2; k++) {
						System.out.print("-");
					}
					System.out.println("★");
				}

				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
