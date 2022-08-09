package com.uni.section2.string;

public class Application2 {

	public static void main(String[] args) {

		String str1 = "java";
		String str2 = "java";
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str4==str3);
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		str2 += "oracle";
		System.out.println(str1==str2);
		
		System.out.println(str1.equals(str4));
		
	}

}
