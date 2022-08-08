package objectarray.com.uni.section2.uses;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MemberManger memberManager = new MemberManger();
		MemberDTO[] members = null;

		while (true) {
			System.out.println("====== 회원 관리 프로그램 =======");
			System.out.println("1.회원 등록");
			System.out.println("2.뢰원 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 선택: ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				members = memberManger.singUpMembers();
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("잘못된 번호를 입력하셨습니다.");
				break;
			}
		}
//		sc.close();
	}

}
