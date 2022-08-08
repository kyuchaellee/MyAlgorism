package com.uni.section6.statickeyword;

public class statickeyword {
	private int nonStaticCount;
	private static int staticCount;
	
	public statickeyword() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNonStaticCount() {
		return this.nonStaticCount;
	}
	
	public int getStaticCount() {
		return statickeyword.staticCount;
	}
	
	public void increseNon() {
		this.nonStaticCount++;
	}
	
	public void increseSta() {
		statickeyword.staticCount++;
	}
	
}
