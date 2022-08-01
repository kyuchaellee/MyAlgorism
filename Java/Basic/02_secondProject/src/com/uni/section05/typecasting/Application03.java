package com.uni.section05.typecasting;

public class Application03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inum = 10;
		long lnum = 100;

		/* 방법1 두수의 결과를 int 형으로 변환후 int 자료형 변수에 리턴 받는다. */
		int isum = (int) (inum + lnum);
		System.out.println(isum);

		/* 방법2 long 형 값을 계산할 때부터 int 형으로 강제 형 변환 후 계산 */
		int isum2 = inum + (int) lnum;
		System.out.println(isum2);

		/* 방법3 결과 값을 long 형 자료형으로 받는다 */
		long lsum = inum + lnum;
		System.out.println(lsum);

		/* 주의 int미만의 연산처리 결과는 int 형 뿐이다. */
		byte byteNum1 = 1;
		byte byteNum2 = 2;
		short shortNum1 = 3;
		short shortNum2 = 4;

		int result = byteNum1 + byteNum2;
		int result1 = byteNum1 + byteNum2;
		int result2 = byteNum1 + shortNum1;
		int result3 = shortNum1 + byteNum1;
		int result4 = shortNum1 + shortNum2;

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		
		//byte result5 = byteNum1 + byteNum2 = 에러발생
		byte result5 = (byte)(byteNum1 + byteNum2);
		
	}

}
