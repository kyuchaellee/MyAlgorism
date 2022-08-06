package object.book.run;
import object.book.model.vo.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookVO vo1 = new BookVO();
		BookVO vo2 = new BookVO("자바의 정석","도우출판","남궁성");
		BookVO vo3 = new BookVO("홍길동전","활빈당","허균",5000000,0.5);
		
		vo1.printlnformation();
		vo2.printlnformation();
		vo3.printlnformation();
	}

}
