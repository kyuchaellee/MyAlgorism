package controller;

import java.util.Scanner;

public class DoctorController {
	static Scanner sc = new Scanner(System.in);
	public  static void DtMain() {
		int num = 0;
		
		while(true) {
			System.out.println("1. 진료 기록 열람");
			System.out.println("2. 진료 기록 작성");
			System.out.println("3. 수술");
			System.out.println("9. 뒤로 가기");
			
			num = sc.nextInt();
			
			switch(num) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 9: return;
			default: System.out.println("다시 입력하세요!");
			}
		}
		
}
}
