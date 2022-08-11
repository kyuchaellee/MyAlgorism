package com.uni.section4.run;

import com.uni.section4.assist.buffer.BufferedTest;
import com.uni.section4.assist.data.DataTest;

public class Application {

	public static void main(String[] args) {
		BufferedTest bt = new BufferedTest();
//		bt.fileSave();
//		bt.fileOpen();
	
//		ObjectTest ot = new ObjectTest();
//		ot.fileSave();
//		ot.fileOpen();
		
//		ObjectsTest ot = new ObjectsTest();
//		ot.fileSave();
//		ot.fileOpen();
		DataTest dt = new DataTest();
		dt.fileSaveOpen();
		
		
	}

}
