package com.uni.section5.parameter;

public class Application {

	public static void main(String[] args) {
		/* 메소드의 파라미터 선언부에는 다양한 종류의 값을 인자로 전달하며 호출할 수 있다. 
	       * 
	       * 매개변수(parameter)로 사용 가능한 자료형
	       * 1. 기본자료형
	       * 2. 기본자료형 배열
	       * 3. 클래스자료형
	       * 4. 클래스자료형 배열
	       * 5. 가변인자
	       * */
		
		ParameterTest pt = new ParameterTest();
		int num =20;
		pt.testPrimaryTypeParameter(num);
		
		int[] arr = new int[] {1,2,3,4,5};
		pt.testPrimaryTypeArrayParameter(arr);
		
		 System.out.print("변경 후 배열의 값 출력 : ");
	      for(int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	      System.out.println();
	      
	      Rectangle r1 = new Rectangle(12.5,22.5);
	      
	      System.out.println("인자로 전달하는 값: " + rl);
	      
	      r1.calcArea();
	      r1.calcRound();
	      
	      pt.testVariableLengthArrayParameter("로운"); // 가변 인자는 전달하지 않아도 된다.
	      pt.testVariableLengthArrayParameter("로운","볼링ㅇ"); // 가변 인자는 전달하지 않아도 된다.
	      pt.testVariableLengthArrayParameter("로운","볼링ㅇ","축구"); // 가변인자는 다 할 수 있슴
	      pt.testVariableLengthArrayParameter("로운","볼링ㅇ","농구"); 
	      pt.testVariableLengthArrayParameter("로운",new String[] {"볼링","골프","서핑"}); 
	      
	}

}
