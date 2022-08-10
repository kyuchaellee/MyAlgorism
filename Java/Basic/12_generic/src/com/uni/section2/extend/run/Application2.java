package com.uni.section2.extend.run;

import com.uni.section2.extend.Bunny;
import com.uni.section2.extend.DrunkenBunny;
import com.uni.section2.extend.Rabbit;
import com.uni.section2.extend.RabbitFarm;
import com.uni.section2.extend.WildCardFarm;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildCardFarm wildCardFarm = new WildCardFarm();
		
//		wildCardFarm.aniType(new RabbitFarm<Mammal>(new Mammal()));  -- 에러.
		wildCardFarm.aniType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.aniType(new RabbitFarm<Bunny>(new Bunny()));

//		wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit())); -- 후손만 가능
		wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.extendsType(new RabbitFarm<Bunny>(new DrunkenBunny()));
		
		wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//		wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny())); --?
	}

}