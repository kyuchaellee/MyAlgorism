package com.uni.section1.extend;

public class Application {

	public static void main(String[] args) {
		/*상속(inheritance)
	       * 부모가 가지고 있는 재산(자바에서는 클래스가 가지는 멤버)을 자식이 물려받는 의미
	       * 자바에서의 상속은 부모클래스의 확장(extend)의 개념
	       * 물려받아서 자신의 것 처럼 사용하는 것 뿐 아니라 추가적인 멤버도 작성이 가능
	       * 특히 메소드 재정의(overriding)라는 기술을 이용해서 부모가 가진 메소드를 재정의 하는 것도 가능
	       * 
	       * 메소드 재정의(overriding)이란 부모가 가지는 메소드 선언부를 그대로 사용하면서
	       * 자식클래스가 정의한 메소드대로 동작하도록 구현 몸체 부분을 새롭게 다시 작성하는 기술이다.
	       * 메소드 재정의를 하면 메소드를 호출할 시 재정의한 메소드가 우선적으로 동작하게 된다.
	       * */
		
		
		 /* 상속이라는 기술을 사용하게 되면 얻게되는 이점은 크게 두 가지로 볼 수 있다.
	       * 1. 새로운 클래스를 작성할 시 기존에 작성한 클래스를 재사용할 수 있다.
	       *  1-1. 재사용 시 생산성을 크게 향상시킬 수 있다. (코드가 줄어듬 ,새롭게 작성하는거보다 빠르다)
	       *  1-2. 공통적으로 사용하는 코드가 부모클래스에 존재하면 수정사항이 생길 시 부모 클래스만 수정해도
	       *       전체적으로 적용된다. (유지보수성 증가)
	       * 2. 클래스간의 계층 관계가 형성되며 다형성의 문법적인 토대가 된다.
	       * 
	       * 오케스트라 
	       * 지휘자- 연주자에게 연주하라 라고 하면 자식연주자들이 모두 연주가능        * 연주자  부모    
	       * 탬버린   트라이앵글 캐스터네츠  자식들
	       * 
	       * 탬버린 탬버린  = new 탬버린();
	       * 케스터 케스터 = new 캐스터();
	       * 트라이 트라이 = new 트라이 ();
	       * 
	       * 탬버린.연주해라();
	       * 케스터.연주해라();
	       * 케스터.연주해라();
	       * 이렇게 각각 연주 하라고 할것을 
	       * 
	       * 연주자 탬버린 = new 탬버린();
	       * 연주자 캐스터 = new 캐스터();
	       * 연주자 트라이 = new 트라이();
	       * 
	       *  이렇게 생성가능하다 부모타입으로 받을수있고 이것을 다형성이라고 한다. 상위타입으로 하위타입을 모두 다룰수있는것 
	       *   그러면 객체배열로 한번에 연주하라고 가능
	       * 
	       * 연주자[] 연주자들 = new 연주자[3];
	       * 연주자[0] = 탬버린;
	       * 연주자[1] = 캐스터;
	       * 연주자[2] = 트라이;
	       * 
	       * for(int i = 0; i< 연주자들.length;i++){
	       *    연주자들[i].연주해라();
	       * }
	       * 
	       * 
	       * 하지만 상속으로 인한 단점도 존재한다.
	       * 1. 부모클래스의 기능을 추가/변경할 시 자식클래스가 정상적으로 동작하는지에 대한 예측이 힘들다.
	       *    상속 구조가 복잡해 질 수록 그 영향에 대한 예측이 힘들며 이런 단점이 유지보수성 증가한다는 장점과는
	       *    반대로 유지보수에 악영향을 미친다.
	       * 2. 또한 부모클래스의 변경 또한 쉽지 않다. 자식클래스에서 중요하게 사용하는 기능인 경우
	       *    부모클래스를 변경할 시 자식 클래스에 모두 영향을 줄 수 있다.
	       *    역시 유지보수에 악영향을 미친다.
	       * 3. 부모클래스에서는 의미있었던 기능이 자식클래스에서는 무의미할 수 있다. (불필요한 기능이 추가됨)
	       * 
	       * 장점과 단점을 고려했을 때, 
	       * 상속은 재사용이라는 장점만 바라보게 되면 오용의 가능성이 있기 때문에 유지보수에 좋지 않는 코드를 작성할 확률이 높다.
	       * 상속은 IS-A 관계로 구분되는 경우에만 사용해야 한다.
	       */
		
		Car car = new Car();
		car.soundHorn();
		car.run();
		car.soundHorn();
		car.stop();
		car.soundHorn();
		
		FireCar fcar = new FireCar();
		fcar.soundHorn();
		fcar.run();
		fcar.soundHorn();
		fcar.stop();
		fcar.soundHorn();
		fcar.sprayWater();
//		fcar.isRunning(); // Car클래스에서 protected 로 선언되어서 상속받은 FireCar 도 쓸 수 잇슴
		
		RacingCar rcar = new RacingCar();
		rcar.soundHorn();
		rcar.run();
		rcar.soundHorn();
		rcar.stop();
		rcar.soundHorn();
		
	}

}
