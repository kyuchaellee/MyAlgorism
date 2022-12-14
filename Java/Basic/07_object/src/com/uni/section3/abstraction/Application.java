package com.uni.section3.abstraction;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	/*	/ * 캡슐화는 유지보수성을 증가시키기 위해 필드의 직접 접근을 제한하고 
	       * public 메소드를 이용해서 간접적으로 접근하여 사용할 수 있도록 만든 기술이다.
	       * 클래스 작성 시 특별한 목적이 아닌 이상 캡슐화가 기본 원칙으로 사용되고 있다.
	       * */
		
	      /* 객체 지향 프로그래밍이란
	       * 현실세계의 모든 사건(event)는 객체와 객체의 상호작용에 의해 일어난다는 세계관을
	       * 프로그램을 만들 때 이용하여 새로운 세계를 창조하는 방법론이다.
	       * 현실 세계와 닮아있지만 현실 세계와 다른 점은,
	       * 객체간의 상호 작용을 한다는 사실은 현실 세계와 동일하지만 의인화 기법이 적용되어
	       * 현실세계에서 불가능한 무생물이나 개념 같은 존재들도 하나의 주체로
	       * 본인의 상태를 스스로 제어하고 행동하도록 한다는 것이 현실 세계와는 다른 점이다. (캡슐화의 의미)
	       * 모든 객체는 책임을 가지고 자신의 역할을 수행한다는 의미이다. (책임주도설계)
	       * 또한 하나의 객체는 너무 많은 일을 수행하는 것이 아닌 적절한 책임을 가지고 있어야 한다.(단일책임의원칙- 메인메소드에만 만들면안되겠지 )*/
		
	      /* 이 때 객체를 설계하기 위해서는 복잡한 현실세계를 그대로 반영하기에는 너무 방대하고 복잡하기 때문에
	       * 현실 세계를 프로그램의 목적에 맞게 단순화하는 추상화 라는 기법을 적용하게 된다.
	       * 
	       * 추상화란?
	       * 공통된 부분을 추출하고 공통되지 않은 부분을 제거한다는 의미를 가지며, 추상화의 목적은 유연성을 확보하기 위함이다.
	       * 유연성 확보는 여러 곳에 적용될 수 있는 유연한 객체를 의미하며, 즉 재사용성이 높아질 수 있게 한다는 의미이다.
	       * 객체의 재사용성이 증가하면 중복 작성되는 코드를 줄일 수 있으며, 오류 발생 가능성을 감소시키고 유지보수성을 증가시킨다.
	       * */
		
	      /* 기능을 최대한으로 단순화 시켜서 프로그램을 만들어보자
	       * 1. 자동차는 처음에 멈춘 상태로 대기하고 있는다.
	       * 2. 카레이서는 먼저 자동차에 시동을 건다. 이미 걸려있는 경우 다시 시동을 걸 수 없다.
	       * 3. 카레이서가 엑셀레이터를 밟으면 시동이 걸린 상태일 경우 자동차는 시속이 10km/h 증가하며 앞으로 나간다.
	       * 4. 자동차가 달리는 중인 경우 브레이크를 밟으면 자동차의 시속은 0으로 떨어지며 멈춘다.
	       * 5. 브레이크를 밟을 때 자동차가 달리는 중이 아니라면 이미 멈춰있는 상태라고 안내한다.
	       * 6. 카레이서가 시동을 끄면 더 이상 자동차는 움직이지 않는다.
	       * 7. 자동차가 달리는 중이라면 시동을 끌 수 없다.
	       * */
		
		/* 여기서 필요한 객체는 카레이서와 자동차 객체이다.
	       * 카레이서가 수신할 수 있는 메세지는 카레이서가 해야 할 일과 동일하다.
	       * 1. 시동을 걸어라
	       * 2. 엑셀레이터를 밟아라
	       * 3. 브레이크를 밟아라
	       * 4. 시동을 꺼라
	       * 
	       * 자동차가 수신할 수 있는 메세지는 자동차가 해야 할 일과 동일하다.
	       * 1. 시동을 걸어라
	       * 2. 앞으로 가라
	       * 3. 멈춰라
	       * 4. 시동을 꺼라*/
		
		CarRacer racer = new CarRacer();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========카레이싱 프로그램==============");
		System.out.println("1.시동걸기");
		System.out.println("2.전진");
		System.out.println("3. 정지");
		System.out.println("4. 시동 끄기");
		System.out.println("8. 메뉴 다시보기");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		
		while(true) {
			
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : racer.startup(); break;
			case 2 : racer.stepAccelator(); break;
			case 3 : racer.stepBreak(); break;
			case 4 : racer.turnOff(); break;
			case 8 : Application.menuagain();
			case 9 : System.out.println("프로그램 조옹료"); return;
			default :System.out.println("잘못입력하신듯 ㅋ"); break;
			}
		}
		
	}
	
	public static void menuagain() {
		System.out.println("===========카레이싱 프로그램==============");
		System.out.println("1.시동걸기");
		System.out.println("2.전진");
		System.out.println("3. 정지");
		System.out.println("4. 시동 끄기");
		System.out.println("8. 메뉴 다시보기");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		
	}

}
