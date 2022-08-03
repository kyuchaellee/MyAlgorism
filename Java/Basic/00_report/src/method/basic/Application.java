package method.basic;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator app = new calculator();
		
		app.checkMethod();
		System.out.println("1부터 10까지의 합 : " +app.sum1to10());
		app.checkMaxNumber(10, 20);
		System.out.println("10과 20 의 합은 : " + app.sumTwoNumber(10, 20));
		System.out.println("10과 5의 차는 : " +app.minusTwoNumber(10, 5));
	}

}
