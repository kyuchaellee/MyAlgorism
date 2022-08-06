package com.uni.section2.encapsulation.problem1;

public class Monster {
	String name;  //몬스터이름
	int hp;   //몬스터 체력
	
	
	public void setHp(int hp) {
		if(hp>0) {
			System.out.println("양수값이 입력되서 몬스터의 체력을 입력한 값으로 변경");
			this.hp = hp;
		}else {
			System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 변경합니다.");
			this.hp = 0;
		}
	}
	
	
}
