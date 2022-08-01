package com.uni.section05.typecasting;

public class Application02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 강제형변환 */
		/*
		 * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다. 예) (바꿀자료형) 값;
		 */

		/* 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다. */
		/*
		 * 1. 강제 형변환 규칙 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다. 1-2. 실수를 정수로 변경 시 강제
		 * 형변환이 필요하다. 1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다. 1-4. 논리형은 강제 형변환 규칙에서도
		 * 제외된다.
		 */

		/* 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다. */
		/* 1-1-1. 정수 끼리의 강제 형변환 */
		
		long lnum = 8;
		int inum = (int)lnum;  // long 형 -> int 형으로 강제 형변환
		
		short snum = (short) inum;
		byte bnum = (byte) snum;
		
		/* 1-1-2. 실수끼리의 강제 형변환 */
		double dnum = 8.0;
		float fnum = (float) dnum;
		
		/* 1-2. 실수를 정수로 변경시 강제 형변환이 필요하다 */
		
		float fnum2 = 4.0f;
		long lnum2 = (long)fnum2; //float는 4byte, long은 8byte임에도 자동 형변환 불가능 (소수점 자리 이하 데이터 손실 가능성)
		
		/*1-3 문자형을 int 미만의 크기의 변수에 저장할 때 강제 형 변환이 필요하다.*/
		char ch = 'a';
		byte bnum2 = (byte) ch;
		short snum2 = (short) bnum2;
		
		/*1-4 논리형은 강제형변환 규칙에서 제외*/
		boolean isTrue = true;
		// byte b = isTrue;
//	      short s = isTrue;
		// int i = isTrue;
		// long l = isTrue;
		// char c = isTrue;
		// float f = isTrue;
		// double d = isTru
	}

}
