package object.shape.views;

import java.util.Scanner;
import object.shape.model.vo.*;

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
		
			
		}
	}
	
	private void triangleMenu(ShapeVO shape) {
		
	}
	private void squareMenu(ShapeVO shape) {
		
	}
	private String inputColor() {
		return "";
	}
	
}
