package com.uni.section4.assist.object;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.uni.section4.assist.dto.Phone;

public class ObjectsTest {
	public void fileSave() {
	ArrayList<Phone> phoneList = new ArrayList<>();
	
	phoneList.add(new Phone("엘지",160000));
	phoneList.add(new Phone("애플",2360000));
	phoneList.add(new Phone("샤오미",360000));
	
	try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone1.txt"))){
		
		for(int i = 0; i<phoneList.size();i++) {
			oos.writeObject(phoneList.get(i));
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void fileOpen() {
		ArrayList<Phone> phoneList = new ArrayList<>();
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone1.txt"))){
			
			int i = 0;
			while(true) {
				phoneList.add((Phone)ois.readObject());
				System.out.println(phoneList.get(i));
				i++;
			}
			
			
		}catch(EOFException e) {
			System.out.println("파일 읽기 완료");
			return;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
