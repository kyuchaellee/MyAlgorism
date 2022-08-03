package operator;

import java.util.Scanner;

public class Application9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수1 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int p =sc.nextInt();
		
		if(p<=num1 || p>num2)
			System.out.println("true");
		else
			System.out.println("false");
		
		sc.close();
	}

}
