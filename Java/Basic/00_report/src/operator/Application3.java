package operator;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num!=0) {
		if(num%2 == 0)
			System.out.println("짝수다");
		else
			System.out.println("홀수다.");
		}else
			System.out.println("0임");
		sc.close();
	}

}
