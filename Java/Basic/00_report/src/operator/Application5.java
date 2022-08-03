package operator;

import java.util.Scanner;

public class Application5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 : ");
		int hak = sc.nextInt();
		
		System.out.print("반 : ");
		int classs = sc.nextInt();
		
		System.out.print("번호 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별 : ");
		char s = sc.nextLine().charAt(0);
		if (s == 'M')
			s = '남';
		else if (s == 'F')
			s = '여';
		
		System.out.print("점수 : ");
		double grade = sc.nextDouble();

		System.out.println(hak + "학년 " + classs + "반 " + num + "번 " + name + " " + s + "학생의 성적은 " + grade + "이다.");
		sc.close();
	}

}
