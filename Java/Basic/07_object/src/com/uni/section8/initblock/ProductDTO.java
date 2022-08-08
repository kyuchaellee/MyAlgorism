package com.uni.section8.initblock;

public class Product {
//	private String name;
//	private int price;
//	
//	private static String brand;
	//2. 명시적 초기화
	private String name = "규철";
	private int price = 90000000;

	private static String brand = "삼성";
	
	//3. static 블록
	static {
//		name = "아이돌"; // static 블로겡서 인스턴스 변수를 초기화 할 수 없다.
//		price = 100000000; //마찬가지
		brand = "나이키";
		
		System.out.println("정적 초기화 블럭 동작");
	}
	
	//4 인스턴스 블록
	{
		name = "아이돌";
		price = 1000000000;
		brand="애플";
	}
	
	public Product() { // 객체 생성시 마다 초기화. 생성자보다 먼저 실행된다.
		// TODO Auto-generated constructondr stub
		System.out.println(" 기본 생성자 호출됨 ");
	}
	public Product(String name,int price,String brand) {
		this.name=name;
		this.price =price;
		Product.brand = brand;
		System.out.println("매개 변수 있는 생성자 호출.");
	}
	   /* 필드값 문자열 합치기 한 문자열 반환용 메소드 */
	   public String getInformation() {
	      
	      return "Product [name=" + this.name + ", price=" + this.price + ",brand=" + Product.brand + "]";
	   }
}
