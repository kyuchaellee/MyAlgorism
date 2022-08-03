package operator;

import java.util.Scanner;

public class Application10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수1 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int p =sc.nextInt();
		
		if(num1 == num2 && num2 == p && num1 == p)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
