package com.uni.section1.object.book;

public class Book {
	 private int number;
	 private String title;
	 private String author;
	 private int price;

	 public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int number, String title, String author, int price) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	 @Override
	 public String toString() {
		 return "Book [number=" + this.number 
	               + ", title=" + title 
	               + ", author=" + author 
	               + ", price=" + price
	               + "]";
	 }

	 
	   /* Object 클래스의 명세에 작성된 일반 규약에 따르면
      * equals() 메소드를 재정의 하는 경우 반드시 hashCode() 메소드도 재정의 하도록 되어 있다.
      * 만약 hashCode()를 재정의 하지 않으면 같은 값을 가지는 동등 객체는
      * 같은 해시코드값을 가져야 한다는 규약에 위반되게 된다. (강제성은 없지만 규약대로 작성하는 것이 좋음)
      * */
	   @Override
	   public boolean equals(Object obj) {
	      
	      if(this == obj) {
	         return true;
	      }
	      
	      
	      if(obj == null) {
	         return false;
	      }
	      
	      Book other = (Book) obj;
	      if(this.number != other.number) {
	         return false;

	      }
	      
	      
	      if(this.title == null) {
	         
	         if(other.title != null) {
	            return false;
	         }
	      }else if(!this.title.equals(other.title)) {
	         return false;
	      }
	      
	      
	      if(this.author == null) {
	         
	         if(other.author != null) {
	            return false;
	         }
	      }else if(!this.author.equals(other.author)) {
	         return false;
	      }
	      
	      
	      
	      
	      if(this.price != other.price) {
	         return false;

	      }
	      
	      
	      return true;
	   }

	@Override
	public int hashCode() {
		int result = 1;
		/* 필드마다 곱해줄 소수값을 선언
	       * 31은 소수이기 때문에 연산 시 동일한 hashCode값이 나오지 않을 확율을 증가시킨다.
	       * 31이 통상적인 관례이며 String 클래스의 hashCode에서도 사용한 값이다.
	       * 중복되는 값이 나오지 않게 하기위해 소수를 곱해주는데 값이 너무작으면 중복된값이 발생할수있고 
	       * 값이 너무크면 오버 플로우가 발생할수있기때문에 통상적으로 31 을 곱해준다. */
		final int PRIME = 31;
		
		   /* String 클래스의 hashCode 메소드는 이미 재정의 되어 있다.
	       * 같은 값을 가지는 문자열은 동일한 hashCode값을 반환한다.
	       * */
		result = PRIME * result + this.number;
		result = PRIME * result + this.title.hashCode();
		result = PRIME * result + this.author.hashCode();
		result = PRIME * result + this.price;
		
		return result;
	}
	   
	   
	 
}
