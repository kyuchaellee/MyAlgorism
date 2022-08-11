package com.uni.section1.run;

import java.io.IOException;
import java.util.Scanner;

import com.uni.section1.A_UncheckException;
import com.uni.section1.B_CheckException;

public class Application {

	public static void main(String[] args) {
	      // 에러종류
	      // - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 --> 소스코드로 해결안됨 --> 심각한 에러
	      // - 컴파일 에러 : 소스코드 문법상 오류 --> 빨간줄로 애초에 오류 알려줌 (매번 컴파일이 진행되고 있기 때문에 컴파일시 문제가 있는 것들을 미리 알려준다)
	      // - 런타임 에러 : 코드 상으로는 문제가 없는데 프로그램 실행할 때 발생하는 에러 (사용자의 실수 일 수도 있고 개발자가 예측 가능 한 경우를 제대로 처리 안 해 놓은걸 수도 있다)
	      
	      // - 논리 에러 : 문법상으로도 문제 없고 실행했을 때도 굳이 문제는 없지만 프로그램 의도상 맞지 않는 것
	      
	      // 우리는 시스템 에러를 제외한 컴파일에러, 런타임에러, 논리에러와 같은 비교적 덜 심각한 것들을 가지고 작업
	      // 이런 것들을 "예외"라고 한다. -->Exception
	      
	      // 이러한 예외들이 "발생"했을 경우에 대해서 "처리"하는 방법을 "예외처리"라고 한다.
	      
	      // 예외처리 방법
	      // 1. try~catch문을 이용
	      // 2. throws를 이용 (떠넘기기)
	      // 3. try~with~resource
		// - 예외(Exception) : 소스 코드 수정으로 해결 가능한 에러

		   // RuntimeException이란 : 미리 정의 되어 있고 이들이 명시하는 예외 상황은
		   //                  프로그램의 종료로 이어지는 것이 자연스러운 경우가 많다.
		   //                  ( 예외처리를 통해 프로그램이 종료되지 않게 처리 할 수 있다.)
		   
		   
		    // - 예외 처리 방법
		    //    1. if문 : 간단한 예외 처리시
		    //             (장점은 프로그램이 종료되지 않고 그 예외 상황에 있어서는 if문이
		    //              실행되지 않게 하여 프로그램의 흐름을 조절할 수 있다.)
		    //             (단점은 if문이 너무 자주 혹은 깊이 사용되면 그게 예외 상황을 처리하는 것인지
		    //              프로그램 상의 주 흐름 코드인지가 구분이 안된다.)
		    //
		    //      2. try-catch문 : 예외상황이 발생할 수 있는 지역에 한해서 예외 처리를 하고
		    //                  어떻게 처리할지도 결정
		    //                  a. try블록 안은 하나의 일의 단위(트랜잭션)이다.
		    //                     예외 상황이 발생하는 부분
		    //                  b. catch 블록의 ()안은 try블록 안에서 발생한 예외클래스의
		    //                     인스턴스 참조변수값(객체의 주소값)이 넘어온다.(JVM이 해줌)
		    //
		    //     3. throws : 예외처리를 하지 않고 자신을 호출한 상위 메소드에게 처리를 위임
		    //              main()메소드까지 위임하고 나서도 throws를 하게 되면
		    //              마지막엔 JVM이 예외 처리를 함
		    //      
		    //      
		    //   RuntimeException의 후손들
		    // - ArrayIndexOutOfBoundsException : 배열의 접근에 잘못된 인덱스 값을 사용하는 예외상황 --> 개발자가 실수 (코드 해결하면됨)
		    // - ClassCastException : 허용할 수 없는 형변환이 진행되는 예외 상황 --> 개발자가 실수 (코드 해결하면됨)
		    // - NegativeArraySizeException : 배열 선언 과정에서 배열의 크기를 음수로 지정하는 예외상황 --> 개발자가 실수 (코드 해결하면됨)
		    // - NullPointerException : 참조변수가 null로 초기화 된 상황에서 메소드를 호출하는 예외상황 --> 개발자가 실수 (코드 해결하면됨)
		    // - ArithmeticException : 나누기 연산에서 부모가 0인 경우 발생하는 예외 상황 --> 개발자가 실수 (코드 해결하면됨)
		    //
		    //--> 이러한 RuntimeException 관련된 예외는 충분히 예측가능한 상황에 있어서 
		    //    아예 애초에 예외가 발생이 안되게끔 if문 조건으로 충분히 처리 가능 
//		A_UncheckException a = new A_UncheckException();
//		a.method1();
//		a.method2();
//		a.method3();
		
		B_CheckException b = new B_CheckException();
		b.method1();
	}

}
