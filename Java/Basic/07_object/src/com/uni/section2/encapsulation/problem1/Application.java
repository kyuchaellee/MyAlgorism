package com.uni.section2.encapsulation.problem1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1번 몬스털 생 송 */
		Monster monster1 = new Monster();

		monster1.name = "루피";
		monster1.hp = 200;

		/* 몬스터 정보 출력 */
		System.out.println("monster1 name : " + monster1.name);
		System.out.println("monster1 hp : " + monster1.hp);

		/* 2번 몬스터 생성 */
		Monster monster2 = new Monster();
		monster2.name = "뿌꾸";
		monster2.hp = -500;

		System.out.println("monster2 name : " + monster2.name);
		System.out.println("monster2 hp : " + monster2.hp);

		/* 3번 몬스터 생성 */
		Monster monster3 = new Monster();
		
		monster3.name = "드라큘라";
		monster3.setHp(200);
		
		System.out.println("monster3 name : " + monster3.name);
		System.out.println("monster3 hp : " + monster3.hp);
		
		/* 4번 몬스터 생성 */
		Monster monster4 = new Monster();
		
		monster4.name = "드라좀비";
		monster4.setHp(-200);
		
		System.out.println("monster3 name : " + monster4.name);
		System.out.println("monster3 hp : " + monster4.hp);

		
	}

}
