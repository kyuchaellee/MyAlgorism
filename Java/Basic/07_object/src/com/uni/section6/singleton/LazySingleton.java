package com.uni.section6.singleton;

public class LazySingleton {
	private static LazySingleton lazy; // 클래스가 초기화 되는 시점에는 정적  필드를 선언해두고 아무고토 안함.
	
	private LazySingleton() {} // 외부에서 생성자 호출을 통한 인스턴스 생성 제한.
	
	public static LazySingleton getInstance() {
		// instance를 생성한 적 이 없는 경우, 인스턴스를 생성해서 반환, 생성한 인ㄴ스턴스가 있는 경우 만들어둔 인스턴스 반환.
		if(lazy==null) {
			lazy = new LazySingleton();
		}
		return lazy;
	}
}
