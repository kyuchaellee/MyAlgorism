package com.uni.section3;

public class Application3 {

	public static void main(String[] args) {
		/** StringBuilder와 StringBuffer 
	      /* 두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이 있다.
	       * StringBuilder : 스레드 동기화 기능 제공하지 않음
	       *                 스레드 동기화처리를 고려하지 않는 상황에서 StringBuffer보다 성능이 좋음
	       * StringBuffer : 스레드 동기화 기능 제공 함
	       *                성능면에서는 StringBuilder보다 느림
	       * 
	       * 두 개의 차이는 스레드 동기화 유무이고, 현재 우리는 스레드를 고려하지 않기 때문에
	       * StringBuilder를 이용할 것이다.
	       * **/
	

	      StringBuffer stringBuffer = new StringBuffer();
	      StringBuilder stringBuilder = new StringBuilder();
	      
	      new Thread(() -> {
	          for(int i=0; i<10000; i++) {
	              stringBuffer.append(1);
	              stringBuilder.append(1);
	          }
	      }).start();
	      
	      new Thread(() -> {
	          for(int i=0; i<10000; i++) {
	              stringBuffer.append(1);
	              stringBuilder.append(1);
	          }
	      }).start();
	      
	      new Thread(() -> {
	          try {
	              Thread.sleep(5000);
	      
	              System.out.println("StringBuffer.length: "+ stringBuffer.length());
	              System.out.println("StringBuilder.length: "+ stringBuilder.length());
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
	      }).start();
	}

}
