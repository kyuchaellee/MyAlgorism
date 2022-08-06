package object.run;
import object.model.vo.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVo vo = new MemberVo();
		
		System.out.println("id : "+vo.getId());
		System.out.println("pwd : "+vo.getPwd());
		System.out.println("name : "+vo.getName());
		System.out.println("age : "+vo.getAge());
		System.out.println("gender : "+vo.getGender());
		System.out.println("phone : "+vo.getPhone());
		System.out.println("email : "+vo.getEmail());
		
		vo.setId("user01");
		vo.setPwd("pass01");
		vo.setName("홍길동");
		vo.setAge(20);
		vo.setGender('M');
		vo.setPhone("010-1234-5678");
		vo.setEmail("hong123@greedy.com");
		System.out.println();
		System.out.println("변경 후 id : "+vo.getId());
		System.out.println("변경 후 pwd : "+vo.getPwd());
		System.out.println("변경 후 name : "+vo.getName());
		System.out.println("변경 후 age : "+vo.getAge());
		System.out.println("변경 후 gender : "+vo.getGender());
		System.out.println("변경 후 phone : "+vo.getPhone());
		System.out.println("변경 후 email : "+vo.getEmail());
	}

}
