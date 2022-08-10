package com.uni.section2.extend;

public class WildCardFarm {
	
	public void aniType(RabbitFarm<?> farm) {
		farm.getAnimal().cry();
	}
	
	public void extendsType(RabbitFarm<? extends Bunny> farm) {
		farm.getAnimal().cry();
	}
	
	public void superType(RabbitFarm<? super Bunny>farm) {
		farm.getAnimal().cry();
	}
}
