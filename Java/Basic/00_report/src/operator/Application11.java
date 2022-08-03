package operator;

import java.util.Scanner;

public class Application11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		
		System.out.print("B사원의 연봉 :  ");
		int num2 = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int p =sc.nextInt();
		
		double num11 = Math.round((num1*0.4)*10)/10.0;
		double num22 = Math.round(num2*10)/10.0;
		double num33 = p*0.15;
		
		System.out.println("A사원의 인센티브 포함 연봉 :");
		if((int)num11+num1 > 3000) {
			System.out.println("3000이상");
		}else {
			System.out.println("3000미만");
		}
		
		System.out.println("B사원의 인센티브 포함 연봉 :");
		if((int)num11+num1 > 3000) {
			System.out.println("3000이상");
		}else {
			System.out.println("3000미만");
		}
		
		System.out.println("A사원의 인센티브 포함 연봉 :");
		
	}

}
