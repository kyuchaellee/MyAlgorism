package com.uni.section1.file;

import java.io.File;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {
		//1. 경로를 지정하지 않으면 현재 프로젝트에 생성.
		try {
			File f1 = new File("test.txt"); // 아직 생성 x, 객체만 생성되잇슴.
			f1.createNewFile(); // 메소드를 실행해야만 실행 파일이 만들어진다.
			
			//2. 기본 드라이브 폴더에 파일 생성
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
		
			//3. 폴더 생성
			File f3 = new File("D\\TEST1"); // 확장자를 지정하지 않고 폴더 생성.
			f3.mkdir();
			
			File f4 = new File("C\\test1\\test.txt");
			f4.createNewFile();
			
			System.out.println(f1.exists());
			System.out.println(f2.exists());
			
			
			File folder = new File("C\\parent");
			folder.mkdir();
			File f5 = new File("C\\parent\\parent.txt");
			f5.createNewFile();
		
		
			System.out.println("파일명 : " + f5.getName());
			System.out.println("절대경로 : " + f5.getAbsolutePath()); // 최상위 경로부터 내파일이 있는경로 까지 모두 나타 낸것
			System.out.println("상대경로 : " + f5.getPath());// 파일이 위치한 폴더를 기준으로 상대적인 경로
			System.out.println("파일 용량 : " + f5.length());
			System.out.println("상위 폴더 : " + folder.getParent());// parent
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
