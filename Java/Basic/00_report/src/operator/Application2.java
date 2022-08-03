package operator;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>=0) {
			if(num==0)
				System.out.println("0이다.");
			else
				System.out.println("양수다");
		}else
			System.out.println("음수다");
	
		sc.close();
	}
	

}
