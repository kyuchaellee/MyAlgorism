package com.uni.section01.array;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   /* 배열이란? 
	       * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도) 이다.
	       * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
	       * */
	      
	      /* 배열의 사용 이유 */
	      /* 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
	       * 1. 연속된 메모리 공간으로 관리할 수 없다. (모든 변수의 이름을 사용자가 관리해야 한다.)
	       * 2. 반복문을 이용한 연속 처리가 불가능하다.
	       * */
	      
	      /* 변수 5개에 값을 저장한다. 
	       * 이 때 사용자(개발자)는 변수의 이름을 모두 알아야 한다.
	       * */
		
//		int num1 = 10;
//	    int num2 = 20;
//	    int num3 = 30;
//	    int num4 = 40;
//	    int num5 = 50;
//	    
//	    int sum = 0;
//	    
//	    sum += num1; 
//	    sum += num2;
//	    sum += num3;
//	    sum += num4;
//	    sum += num5;
//	      
//	      System.out.println("sum : " + sum);
		
		/*배열 할당*/
		int sum =0;
		int[] arr = new int[5];
		for(int i =0,value = 0; i<arr.length;i++) {
			arr[i] = value+=10;
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i<arr.length;i++) {
			sum+=arr[i];
			
		}
		System.out.println(sum);
	}

}
