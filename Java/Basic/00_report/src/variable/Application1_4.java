package variable;

import java.util.Scanner;

public class Application1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String line = sc.nextLine();
		char[] aaa = line.toCharArray();
		
		System.out.println("첫 번째 문자 : " + aaa[0]);
		System.out.println("두 번째 문자 : " + aaa[1]);
		System.out.println("세 번째 문자 : " + aaa[2]);
		
		sc.close();
	}
}
