package com.uni.section3.abstraction;

public class CarRacer {

	private Car car = new Car();
	
	public void startup() {
		car.startUp();
	}
	public void stepAccelator() {
		car.go();
	}
	
	public void stepBreak() {
		car.stop();
	}
	
	public void turnOff() {
		car.turnOff();
	}
}
