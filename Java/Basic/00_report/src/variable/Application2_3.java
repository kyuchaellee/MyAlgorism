package variable;

public class Application2_3 {
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		System.out.println( iNum1 - (iNum2*2) ); // 2
		System.out.println( (int)dNum ); // 2
		System.out.println( Math.round((iNum2*2) +(int)dNum)*10/10.0 ); // 10.0
		System.out.println( Math.round(iNum1)*10/10.0 ); // 10.0
		System.out.println( (double)iNum1 - (double)(iNum2*1.875) ); // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println( iNum1 - (int)(2.4*fNum) ); // 3
		System.out.println( Math.round((double)(iNum1-2.2222222*fNum)*1000000)/1000000.0 );// 3.3333333
//		System.out.println( iNum1 - fNum ); // 3.333333333333335 // 위에 문제 참고
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println( (char)(ch + iNum1) ); // 'K'
		}
}
