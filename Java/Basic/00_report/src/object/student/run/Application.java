package object.student.run;
import java.util.Scanner;
import object.student.model.vo.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("학년,반,키,이름,성별 순으로 입력하시오");
		int grade = sc.nextInt();
		int classroom= sc.nextInt();
		double height = sc.nextDouble();
		sc.nextLine();
		String name = sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		
		StudentVO stu = new StudentVO(grade,classroom,name,height,gender);
		stu.printInformation();
	}

}
