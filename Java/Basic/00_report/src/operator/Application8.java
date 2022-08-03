package operator;

import java.util.Scanner;

public class Application8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		int a= ss.charAt(7);
		if(a == 1)
			System.out.println("남자");
		else
			System.out.println("여자");
		sc.close();
	}

}
