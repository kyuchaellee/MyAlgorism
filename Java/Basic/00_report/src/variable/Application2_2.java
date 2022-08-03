package variable;

import java.util.Scanner;

public class Application2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double k = sc.nextDouble();
		
		System.out.print("영어 : ");
		double e = sc.nextDouble();
		
		System.out.print("수학 : ");
		double m = sc.nextDouble();
		
		System.out.println("총점 : " + (int)(k+e+m));
		System.out.println("평균 : " + (int)((k+e+m)/3.0));
	}

}
