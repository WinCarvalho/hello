package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test_Object_IO {
	public static void main(String[] args) {
		//writeObject();
		readObject();
	}

	private static void readObject() {
		File file = new File("D:\\Date_object.dat");
		try (FileInputStream fileInput = new FileInputStream(file);
				ObjectInputStream objInput = new ObjectInputStream(fileInput);
			) 
		{
			Date today = (Date) objInput.readObject();
			
			System.out.println("Date Object is read to a file"+ today);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
		
	

	private static void writeObject() {

		File file = new File("D:\\Date_object.dat");
		try (FileOutputStream fileOutput = new FileOutputStream(file);
				ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput);
			) 
		{
			Date today = new Date(16, 11, 2019);
			objOutput.writeObject(today);
			System.out.println("Date Object is written to a file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
