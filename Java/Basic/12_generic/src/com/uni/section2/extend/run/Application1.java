package com.uni.section2.extend.run;

import com.uni.section2.extend.Bunny;
import com.uni.section2.extend.DrunkenBunny;
import com.uni.section2.extend.Rabbit;
import com.uni.section2.extend.RabbitFarm;

public class Application1 {

	public static void main(String[] args) {
//		상위 타입이나 아예 다른 타입은 당연히 사용 불가.
//		RabbitFarm<animal> farm1 = new RabbitFarm<>();  
//		RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
//		RabbitFarm<Snake> farm2 = new RabbitFarm<>();
		RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
		RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
		RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();
	
		farm1.setAnimal(new Rabbit());
		farm1.getAnimal().cry();
		
		farm2.setAnimal(new Bunny());
		farm2.getAnimal().cry();;
		
		farm1.setAnimal(new DrunkenBunny());
		farm1.getAnimal().cry();;
	}

}
