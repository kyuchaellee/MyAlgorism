package com.uni.section01.array;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배열의 사용 방법 */

		/* 배열의 선언 */
		/*
		 * 자료형[] 변수명; 자료형 변수명[]; 로 선언할 수 있다.
		 */

		/* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다. */

		int[] arr;
		char carr[];

		/*
		 * 선언한 레퍼런스변수에 배열을 할당하여 대입할 수 있다.
		 * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
		 * 발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에 참조자료형(reference
		 * type)이라고 한다.
		 */
		
//		arr = new int[];  -- 크기 지정 안해서 에러 발생
		int iarr[] = new int[5];
		char ccarr[] = new char[10];
	
		/* heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역이다.
	       * stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있다.
	       * */
		
		/* hashcode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다. 
	       * 동일객체인지 비교할 때 사용할 목적으로 쓰여지며, 동등객체를 동일객체 취급하기 위한 용도로 overring 해서 사용한다. 
	       * 이 부분은 뒤에서 다루게 되니, 그 전까지는 쉽게 주소값이라고 생각하고 사용하면 된다.
	       * */
		
		   System.out.println("iarr2의 길이 : " + iarr.length);
		      System.out.println("carr2의 길이 : " + ccarr.length);
		      
			      /* 배열의 길이를 알 수있는 기능을 필드로 제공하고 있다. 
			       * 필드 또한 뒤에서 다루게 될 것이다. (일종의 변수라고 보면 된다) */
			      /* 참고로 String의 문자열 길이는 메소드로 제공하고 있기 때문에 length()로 사용한다. */
//		      System.out.println("darr의 hashcode : " + darr.hashCode());
//		      System.out.println("darr의 길이 : " + darr.length);
//		      
//		      sc.close();
		      int size = 10;
		      double darr[] = new double[size];
		      System.out.println(darr.length);
		      System.out.println(darr.hashCode());
		     
		      
		      darr = new double[30];   // new 명령어는 그냥 새로 만든다고 생각
		      System.out.println(darr.length);
		      System.out.println(darr.hashCode());
		      
		      /* NullPointerException 발생함
		       * 아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있는 경우 참조연산자를 사용하게 될 때 발생하는 에러이다.
		       * */
		      darr = null;
		      
		      
		      /* 한번 할당된 배열은 지울 수 없다.
		       * 다만 레퍼런스 변수를 null로 변경하여 더 이상 주소를 참조할 수 없게된 배열은
		       * 일정 시간이 지난 후 heap의 old 영역으로 이동하여 GC(가비지컬렉터)가 삭제시킨다.
		       * 한 번 찾아갈 수 있는 주소값을 잃어버린 배열은 다시 참조 불가능하다.
		       * */
		      System.out.println(darr.length);
		      
		      
		      /* 기본적으로 배열을 선언하고 할당하게 되면
		       * 배열의 각 인덱스에는 자바에서 지정한 기본값으로 초기화가 된 상태가 된다.
		       * heap영역은 값이 없는 빈 공간이 존재할 수 없다.
		       * */
		      
		      /* 값의 형태 별 기본값
		       * 정수 : 0
		       * 실수 : 0.0
		       * 논리 : false
		       * 문자 : \u0000
		       * 참조 : null
		       * */
		      
		      int[] iarr2 = new int[5];
		      
		      /* int의 기본값인 0으로 초기화가 되어 있다. */
		      System.out.println(iarr2[0]);
		      System.out.println(iarr2[1]);
		      System.out.println(iarr2[2]);
		      System.out.println(iarr2[3]);
		      System.out.println(iarr2[4]);
		      
		      /* 반복문을 통해서도 확인할 수 있다. */
		      for(int i = 0; i < iarr2.length; i++){
		         System.out.println("iarr[" + i + "]의 값 : " + iarr2[i]);
		      }
		      /* 자바에서 지정한 기본값 외의 값으로 초기화를 하고싶은 경우 블럭을 이용한다.
		       * 블럭을 사용하는 경우에는 new를 사용하지 않아도 되며, 값의 갯수만큼 자동으로 크기가 설정된다.
		       * */
		      int[] iarr8 = {11, 22, 33, 44, 55};
		      
		      /* 이러한 형식으로도 사용 가능하다. */
		      int[] iarr3 = new int[] {11, 22, 33, 44, 55};
		      
		      System.out.println("iarr2의 길이 : " + iarr2.length);
		      System.out.println("iarr3의 길이 : " + iarr3.length);
		      
		      /* 초기화 값 확인 */
		      for(int i = 0; i < iarr2.length; i++) {
		         System.out.println("iarr2[" + i + "] : " + iarr2[i]);
		      }
		      
		      for(int i = 0; i < iarr3.length; i++) {
		         System.out.println("iarr3[" + i + "] : " + iarr3[i]);
		      }
		      
		      //과일 이름 4 개
		      String[] str = {"사과","바나나","복숭아","포도"};
		      for(int i = 0;i<str.length;i++) {
		    	  System.out.println(str[i]);
		      }
		      
	}

}
