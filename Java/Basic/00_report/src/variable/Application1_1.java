package variable;

import java.util.Scanner;

public class Application1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 :");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별을 입력하세요 :");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("키을 입력하세요 :");
		double h = sc.nextDouble();

		System.out.println("키 " + h +"인 "+ age +"살 "+ gender+"자 "+ name +"님 반갑습니다 ^^");
		
		
		
		sc.close();
	}

}
