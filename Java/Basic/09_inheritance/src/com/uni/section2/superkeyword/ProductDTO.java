package com.uni.section2.superkeyword;

import java.util.Date;

public class ProductDTO {
	private String code;
	private String brand;
	private String name;
	private int price;
	private Date manufacturingDate;
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(String code, String brand, String name, int price, Date manufacturingDate) {
		super();
		this.code = code;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
	/* 아무 클래스도 상속받지 않았는데 super()가 호출된다.
     * java.lang.Object 클래스의 생성자를 호출하는 것이다.
     * 모든 클래스는 Object 클래스의 후손이기 때문이다.
     * */
	
	   /* 모든 필드 값을 문자열로 반환하는 메소드 */
	   public String getInformation() {
	      return "ProductDTO [code=" + code + ", brand=" + brand + ", name=" + name + ", price=" + price
	            + ", manufacturingDate=" + manufacturingDate + "]"; 
	   }
	   
	
	
	
	
	
}
