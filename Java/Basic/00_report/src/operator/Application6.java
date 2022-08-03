package operator;

import java.util.Scanner;

public class Application6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		if(age>19)
			System.out.println("성인");
		else if(age>13 && age<19) 
			System.out.println("청소년");
		else
			System.out.println("청소년");
		sc.close();
	}

}
