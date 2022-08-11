package com.uni.section4.assist.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	public void fileSave() {
	/*	BufferedWriter bw  = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			bw.write("안녕하세연");
			bw.write("반갑습니다.");
			bw.newLine();
			bw.write("감사합니다.");
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw!=null)
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		try(BufferedWriter bw= new BufferedWriter(new FileWriter("c_buffer.txt"));){
			bw.write("안녕하세연");
			bw.write("반갑습니다.");
			bw.newLine();
			bw.write("감사합니다.");
		}catch(IOException e){
			e.printStackTrace();
		}
}
	
	public void fileOpen() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
			String temp = null;
			while((temp = br.readLine())!=null) {
				System.out.println(temp);
			}
		}catch(FileNotFoundException e) {
			
		}catch(IOException e){
			
		}
	}
}
