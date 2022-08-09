package com.uni.section1.poly;

public class Application2 {

	public static void main(String[] args) {
		//상위 타입으로 객체 배열 5개 만들고 각 인덱스에 인스턴스 생성 해서 대입.
		//cry 메소드 실행
		
		//각 클래스 별 고유 메소드 동작 instancof 사용 토끼나, 호랑이가 아니면 "토끼나 호랑이 아니라고" 출력
		Animal[] animal = new Animal[5];

		animal[0] = new Rabbit();
		animal[1] = new Tiger();
		
		animal[0].cry();
		for(int i =0;i<animal.length;i++) {
			if(animal[i] instanceof Rabbit) {
				((Rabbit)animal[i]).jump();
			}
		}
		
		
	}

}
