package com.uni.section1.poly;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Application3 app = new Application3();
			Animal animal1 = new Rabbit();
			Animal animal2 = new Tiger();
			
			app.feed(animal1);
			app.feed(animal2);
			
			Rabbit rab = new Rabbit();
			Tiger tig = new Tiger();
			
			app.feed(rab);  // 묵시적 형 변환
			app.feed(tig);  // 묵시적 형 변환
	}
	
	public void feed(Animal animal) {
		animal.eat();
	}
}
