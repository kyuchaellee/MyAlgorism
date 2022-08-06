package com.uni.section3.abstraction;

public class Car {

	private boolean isOn; // 초기 상태 = 시동 꺼짐.
	private int speed;

	public void startUp() {

		if (isOn) {
			System.out.println("이미 시동이 걸려있습니다.");
		} else {
			isOn = true;
			System.out.println("시동을 걸었습니다. 출발하세연");
		}
	}

	public void go() {
		if (isOn) {
			System.out.println("차가 앞으로 움직입니다.");
			this.speed += 10;
			System.out.println("현재 차의 시속은 " + this.speed + "km/h");
		} else {
			System.out.println("차의 시동이 안걸려있으니 시동부터 걸어주세요");
		}
	}

	public void stop() {
		if (isOn) {
			if (this.speed > 0) {
				this.speed = 0;
				System.out.println("브레이키 로 인해 차가 멈췃습니다.");
			} else {
				System.out.println("멈춰있습니다.");
			}
		} else {
			System.out.println("시동이 꺼져 잇네여");
		}
	}

	public void turnOff() {
		if (isOn) {
			if (this.speed > 0) {
				System.out.println("달리는 중 시동을 끌 수 없습니다.");
			} else {
				this.isOn = false;
				System.out.println("시동을 껏습니다. 운행하려면 다시 켜주세요.");
			}
		} else {
			System.out.println("이미 시동이 꺼져 잇네여");
		}
	}
}
