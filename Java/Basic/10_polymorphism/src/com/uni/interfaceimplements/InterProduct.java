package com.uni.interfaceimplements;

public interface InterProduct { //extends java.io.Serializable,java.util.Comparator

	/* 인터페이스는 상수 필드만 작성 가능하다. 
	    * public static final 제어자 조합을 상수 필드라고 부른다.
	    * 반드시 선언과 동시에 초기화 해줘야 한다.
	    * */
	public static final int MAX_NUM = 100;
	int MIN_NUM = 0; // 묵시적으로 ㅍ퍼블릭 스태틱 파이널 되버림.
	
	//인터페이스는 생성자를 가질 수 없다.
	//인터페이스는 구현부가 있는 nonStatic 메소드를 가질 수 없다.
//	public void nonStaticMethod() {}
	
	// only 추상 메소드만 가능.
	   /* 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다. (다른 접근제한자 사용 불가)
	    * 따라서 인터페이스의 메소드를 오버라이딩 하는 경우 
	    * 반드시 접근제한자를 public으로 해야 오버라이딩이 가능하다. 
	    * */
	public abstract void nonStaticMethod();
	void abstMethod(); // public abstract 묵시적으로 처리됨.
	
	
	//static 메소드는 작성 가능.(1.8 jdk에서 추가됨)
	public static void staticMethod() {
		System.out.println("Interface 클래스의 static 메소드 호출됨.");
	}
	//default 키워드를 사용하면 non static 메소드로 작성 가능하다.
	public default void defaultMethod() {
		System.out.println("Interface 클래스의 default 메소드 호출됨.");
	}
	
	
	
}
