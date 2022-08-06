package object.emp.run;
import object.emp.model.vo.*;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("사원 번호 입력하세요: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("사원 이름 입력하세요: ");
		String name = sc.nextLine();
		System.out.println("사원 부서 입력하세요: ");
		String dept = sc.nextLine();
		System.out.println("사원 직급 입력하세요: ");
		String job = sc.nextLine();
		System.out.println("사원 나이 입력하세요: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("사원 성별 입력하세요: ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("사원 급여 입력하세요: ");
		int salary = sc.nextInt();
		System.out.println("사원 보너스 포인트 입력하세요: ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		System.out.println("사원 휴대번호 입력하세요: ");
		String phone = sc.nextLine();
		System.out.println("사원 주소 입력하세요: ");
		String address = sc.nextLine();
		
		EmployeeVO emp = new EmployeeVO();
		
		emp.setNumber(number);
		emp.setName(name);
		emp.setDept(dept);
		emp.setJob(job);
		emp.setAge(age);
		emp.setGender(gender);
		emp.setSalary(salary);
		emp.setBonusPint(bonusPoint);
		emp.setPhone(phone);
		emp.setAddress(address);
		
		System.out.println(emp.getNumber());
		System.out.println(emp.getName());
		System.out.println(emp.getDept());
		System.out.println(emp.getJob());
		System.out.println(emp.getAge());
		System.out.println(emp.getGender());
		System.out.println(emp.getSalary());
		System.out.println(emp.getBonusPint());
		System.out.println(emp.getPhone());
		System.out.println(emp.getAddress());
	}

}
