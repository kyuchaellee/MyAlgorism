package object.shape.views;

import java.util.Scanner;
import object.shape.model.vo.*;
import object.shape.manager.*;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("============ 도형계산기 ============ \n"+
				 "3. 삼각형\n"+
				 "4. 사각형\n"+
				 "9. 프로그램 종료\n"+
				 "===================================");
		System.out.print("계산하려는 도형을 선택하세요: ");
		int number = sc.nextInt();
		if(number == 3) {
		System.out.print("높이를 입력하세요.");
		double h = sc.nextDouble();
		System.out.print("너비를 입력하세요.");
		double w = sc.nextDouble();
		ShapeVO shape = new ShapeVO(3,h,w);
		triangleMenu(shape);
		}else if(number==9) {
			System.out.println("끝");
			return;
		}
	}
	
	private void triangleMenu(ShapeVO shape) {
		int num = 0;
		while(num!=9) {
			System.out.println("======= 삼각형 계산기 =======");
			System.out.println("1. 삼각형 둘레 구하기");
			System.out.println("2. 삼각형 면적 구하기");
			System.out.println("3. 선택한 도형 정보 출력");
			System.out.println("4. 도형의 색상 칠하기");
			System.out.println("메인 메뉴로 돌아가기");
			TriangleManager tri = new TriangleManager();
			
			num = sc.nextInt();
			switch(num){
			case 1: tri.calcPerimeter(shape);
				    break;
			case 2: tri.calcArea(shape);
		    		break;
			case 3:
					tri.printShape(shape);
					break;
			case 4:
				System.out.println("무슨 색으로 칠하실래요");
				String str = new String();
				tri.paintColor(shape,str);
				break;
			}
			
		}
		this.mainMenu();
	}
	private void squareMenu(ShapeVO shape) {
		
	}
	private String inputColor() {
		return "";
	}
	
}
