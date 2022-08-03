package operator;

import java.util.Scanner;

public class Application7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 :");
		int k = sc.nextInt();
		
		System.out.print("영어 :");
		int e = sc.nextInt();
		
		System.out.print("수학 :");
		int m = sc.nextInt();
		double avg = (k+m+e)/3.0;
		
		System.out.println("합계 : " + (k+m+e));
		System.out.println("평균 : " + Math.round(((k+m+e)/3)*10)/10.0);
		if(avg>=60.0&&k>=40&&m>=40&&e>=40) {
			System.out.println("합격");
		}else
			System.out.println("불합격");
		sc.close();
	}

}
