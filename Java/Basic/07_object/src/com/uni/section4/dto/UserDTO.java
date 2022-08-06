package com.uni.section4.dto;

import java.util.Date;

public class UserDTO {
	private String id;
	private String pwd;
	private String name;
	private Date enrollDate;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
		
	}
	public UserDTO(String id,String pwd,String name,Date enrollDate) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.enrollDate=enrollDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	public String getInformation() {
	      
	      return "User [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
	   }
	
}
