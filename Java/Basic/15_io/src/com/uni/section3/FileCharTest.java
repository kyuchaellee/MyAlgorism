package com.uni.section3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {

	public void fileSave() {
		//fileWritter: 2byte 단위로 출력
		
		FileWriter fw = null;
		try {
			fw=new FileWriter("b_char.txt",true);
			fw.write("와 재밌다");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			
			char[] cArr = {'a','p','p','l','e'};
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(fw!=null)
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void fileOpen() {
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
			
			int value =0;
			while((value=fr.read())!=-1) {
				System.out.println(value);
				System.out.println((char)value);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fr != null)
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
