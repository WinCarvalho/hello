package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_File_IO {
	public static void main(String[] args) {
		// readFile();
		readFileCloseable();
		writeFile();
	}

	private static void writeFile() {
		// TODO Auto-generated method stub
		System.out.println("writeFile");
		File file = new File("D:\\Out1.txt");
		String message= "Hell, output..sleep tight";

		try (
				// all autoxclosable file come here..
				FileOutputStream fileOutput = new FileOutputStream(file); // multiple can be displayed from here by
																		// creating different objects
		) {
			fileOutput.write(message.getBytes());   //will write message in file system
		}
		 catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
}
	// try-with-resources- JDK7
	private static void readFileCloseable() {
		System.out.println("readFileCloseable");
		File file = new File("D:\\Message.txt");

		try (
				// all autoxclosable file come here..
				FileInputStream fileInput = new FileInputStream(file); // multiple can be displayed from here by
																		// creating different objects
		) {
			int value = 0;

			while ((value = fileInput.read()) != -1) {
				System.out.print((char) value);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void readFile() {
		File file = new File("D:\\Message.txt");
		if (!file.exists()) {
			System.err.println("file not found");
			System.exit(0);
		}

		FileInputStream fileInput = null;

		try {
			fileInput = new FileInputStream(file);
			int value = 0;

			while ((value = fileInput.read()) != -1) {
				System.out.print((char) value);
			}

			/*
			 * do { //loop to display entire messge.txt value = fileInput.read();
			 * System.out.print((char) value); } while (value != -1);
			 */
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (fileInput != null)
					fileInput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
