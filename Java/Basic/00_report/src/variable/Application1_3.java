package variable;

import java.util.Scanner;

public class Application1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 가로 : ");
		double garo = sc.nextDouble();
		System.out.print(" 세로 : ");
		double saro = sc.nextDouble();
		
		System.out.println("면적 : " + (garo*saro));
		System.out.println("둘레 : " + 2.0*(garo+saro));
		sc.close();
	}

}
