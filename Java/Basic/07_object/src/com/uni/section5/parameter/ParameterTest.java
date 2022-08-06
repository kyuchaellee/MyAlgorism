package com.uni.section5.parameter;

public class ParameterTest {
	public ParameterTest() {
		// TODO Auto-generated constructor stub
	}
	public void testPrimaryTypeParameter(int num) {
	      
	      System.out.println("매개변수로 전달받은 값 : " + num);
	      
	   }
	
	public void testPrimaryTypeArrayParameter(int[] iarr) {
	      
	      /* 배열의 주소가 전달된다.
	       * 즉 인자로 전달하는 배열과 매개변수로 전달받은 배열은 서로 동일한 배열을 가리킨다.(얕은복사) */
	      System.out.println("매개변수로 전달받은 값 : " + iarr);
	      
	      /* 배열의 값 출력 */
	      System.out.print("배열의 값 출력 : ");
	      for(int i = 0; i < iarr.length; i++) {
	         System.out.print(iarr[i] + " ");
	      }
	      System.out.println();
	      
	      /* 배열의 0번인덱스에 값 변경 */
	      iarr[0] = 99;
	      
	      /* 값 변경 후 배열의 값 출력 */
	      System.out.print("변경 후 배열의 값 출력 : ");
	      for(int i = 0; i < iarr.length; i++) {
	         System.out.print(iarr[i] + " ");
	      }
	      System.out.println();
	      
	   }
	public void testClassTypeParameter(Rectangle rectAngle) {
		   /* 인스턴스도 주소가 전달된다. 
	       * 즉, 인자로 전달하는 인스턴스와 매개변수로 전달받은 인스턴스는 서로 동일한 인스턴스를 가리킨다. (얕은복사)*/
	      System.out.println("매개변수로 전달받은 값 : " + rectAngle);
	      
	      /* 사각형의 넓이와 둘레 출력 */
	      System.out.println("변경 전 사각형의 넓이와 둘레 ========================");
	      rectAngle.calcArea();
	      rectAngle.calcRound();
	      
	      /* 사각형의 너비와 높이를 변경 */
	      rectAngle.setWidth(100);      //자동형변환 적용됨
	      rectAngle.setHeight(100);
	      
	      /* 변경 후 사각형의 넓이와 둘레 출력 */
	      System.out.println("변경 후 사각형의 넓이와 둘레 ========================");
	      rectAngle.calcArea();
	      rectAngle.calcRound();
	   }
	
	public void testVariableLengthArrayParameter(String name,String...hobby){
		System.out.println("이름 : " + name);
	      System.out.println("취미의 갯수 : " + hobby.length);
	      System.out.print("취미 : ");
	      for(int i = 0; i < hobby.length; i++) {
	         System.out.print(hobby[i] + " ");
	      }
	      System.out.println();
	}
	
}
