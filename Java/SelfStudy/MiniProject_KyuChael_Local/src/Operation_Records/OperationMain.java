package Operation_Records;

import java.util.Scanner;

public class OperationMain {
	public static Scanner sc = new Scanner(System.in);
	
	public void OpMain() {
		int num = 0;
		while(true) {
		System.out.println("1. 수술 일정 작성");	
		System.out.println("2. 수술 일정 조회");	
		System.out.println("3. 수술 일정 삭제");	
		System.out.println("4. 수술 일정 수정");	
		System.out.println("9. 뒤로 가기");	
		
		num = sc.nextInt();
		switch(num) {
		case 1:  break;
		case 2:  break;
		case 3: break;
		case 4: break;
		case 9: return;
		default: System.out.println("다시 입력하세요.");
			}
		}
	}
}
