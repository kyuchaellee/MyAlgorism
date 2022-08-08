package objectarray.com.uni.section1.init;

public class Application {

	public static void main(String[] args) {
		   /* 객체배열은 레퍼런스변수에 대한 배열이다. 
	       * 생성한 인스턴스도 배열을 이용해서 관리하면
	       * 동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
	       * 또한 반환값은 1개의 값만 반환할 수 있기 때문에
	       * 동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체배열을 이용할 수 있다. 
	       * */
		
		Car car1 = new Car("benz",300);
		Car car2 = new Car("rambo",60);
		Car car3 = new Car("hyndae",130);
		Car car4 = new Car("bmw",250);
		Car car5 = new Car("icos",200);
		
		car1.driveMaxSpeed();
		car2.driveMaxSpeed();
		car3.driveMaxSpeed();
		car4.driveMaxSpeed();
		car5.driveMaxSpeed();
		
		Car[] carArray = new Car[5];
		
		carArray[0] = new Car("페라리",300);
		carArray[1] = new Car("램보",10);
		carArray[2] = new Car("볼보",30);
		carArray[3] = new Car("마세라티",500);
		carArray[4] = new Car("티볼리",150);
		
		//할당과 동시에 초기화
		Car[] carArray2 = {new Car("benz",300)};		
		//향상된 for 문으로 출력 = for each 
		for(Car str : carArray) {
			str.driveMaxSpeed();
		}
	}

}