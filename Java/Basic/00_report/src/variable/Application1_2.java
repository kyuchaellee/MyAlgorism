package variable;

import java.util.Scanner;

public class Application1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		System.out.println("더하기 결과 : "+(first+second));
		System.out.println("빼기 결과 : " + (first-second));
		System.out.println("곱하기 결과 : " + (first*second));
		System.out.println("나누기 몫 결과 : "+(first/second));
		
		
		sc.close();
	}

}
