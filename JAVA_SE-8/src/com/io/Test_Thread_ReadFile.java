package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test_Thread_ReadFile {
	public static void main(String[] args) {
		System.out.println("Test_Thread_ReadFile start");
		File file = new File("D:\\complaints.csv");
		System.out.println("Test_Thread_ReadFile ended");

		new ReadFileThread(file).start();
	}
}

class ReadFileThread extends Thread {
	File file;

	public ReadFileThread(File file) {
		this.file = file;
	}

	@Override
	public void run() {
		// file.read file
		try (FileInputStream fileInput = new FileInputStream(file);
			) {
			int value = 0;
			String line = "";
	        String cvsSplitBy = ",";
	        String[] comma;
	        BufferedReader br = new BufferedReader(new FileReader(file));
			while ((comma.equals(fileInput.read())) != -1) {
				
				 comma = line.split(cvsSplitBy);
				System.out.print(" "+comma);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
