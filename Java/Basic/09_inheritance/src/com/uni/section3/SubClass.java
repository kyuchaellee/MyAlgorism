package com.uni.section3;

public class SubClass extends SuperClass {
	 /* 1. 메소드 이름 변경하면 에러 발생
	    * 2. 메소드의 리턴타입 변경하면 에러 발생
	    * 3. 매개변수 갯수나, 타입이 변경되면 에러 발생
	    * 
	    *  */
	@Override
	public void method(int mem) {
		// TODO Auto-generated method stub
		super.method(mem);
	}
	
//	@Override
//	void protectedMethod() {  // 부모 메소드의 접근 제한자와 같거나 더 넓은 범위로 오버라이딩 가능.
//		// TODO Auto-generated method stub
//		super.protectedMethod();
//	}
//	protected void protectdMethod() {}
	public void protectMethod() {}  // 같은 범위나 더 넓은 의미일때 가능.
	
	// final 매소드 오버라이딩 불가, private 메소드 오버라이딩 불가.
}
