package com.uni.section5.parameter;

public class Rectangle {
	
	private double width;
	private double height;
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
		
	
	/**<pre>
	    *   사각형의 넓이를 구하는 용도의 메소드
	    * </pre>
	    * */
	   public void calcArea() {
	      
	      double area = width * height;
	      
	      System.out.println("이 사각형의 넓이는 " + area + "입니다.");
	   }
	   
	   /**<pre>
	    *   사각형의 둘레를 구하는 용도의 메소드
	    * </pre>
	    * */
	   public void calcRound() {
	      
	      double round = (width + height) * 2;
	      
	      System.out.println("이 사각형의 둘레는 " + round + "입니다.");
	   }
	   
	
}
