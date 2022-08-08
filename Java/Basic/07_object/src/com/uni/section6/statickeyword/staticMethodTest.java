package com.uni.section6.statickeyword;

public class staticMethodTest {
	private int count;
	private static int staticCount;
	
	public void nonStaticMethod() {
		this.count++;
		staticMethodTest.staticCount++;
		System.out.println("nonstaticMethod 호출됨");
	}
	
	public static void staticMethod() {
//		this.count; -- static은 인스턴스 생성전에 프로그램 실행시 이미 메모리에 올라가 있고 인스턴스 생성하지 않고도 사용하는 스태틱 메소드 이므로 this 주소를 사용할 수 없다.
		staticCount++; // 스태틱으로 선언 된 변수 이므로 사용가능하고 같은 클래스 내에서는 클래스명 생략 가능.
		System.out.println("staticMethod 호출됨");
	}
}
