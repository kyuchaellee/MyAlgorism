package operator;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("사람 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 수 : ");
		int candy = sc.nextInt();
		int gonpyongzzz = candy/people;
		int namerge = candy%people;
		
		System.out.println("1인당 사탕 개수 : " + gonpyongzzz);
		System.out.println("남는 사탕 개수 : " + namerge);
	}

}
