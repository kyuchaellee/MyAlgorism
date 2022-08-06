package com.uni.section2.encapsulation.problem4;

public class Monster {
	private String name;
	private int hp;
	
	public void setInfo(String info) {
		this.name =info;
	}
	
	public void setHp(int hp) {
		if(hp>0) {
			this.hp =hp;
		}else {
			this.hp=0;
		}
	}
	
	
	public String getInfo() {
		return "몬스터의 이름은 "+this.name+"이고, 체력은 " + this.hp; 
	}
}
