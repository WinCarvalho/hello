package com.lang;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;

public class _Runtime {

	public static void main(String[] args) {
		try {
			
			System.setOut(new PrintStream (new File("D:\\out.txt")));
	//Runtime.getRuntime().exec("cmd.exe");
	//Runtime.getRuntime().exec("notepad.exe"); 	
	//Runtime.getRuntime().exec("mspaint.exe"); 
		
		String[] garbage = new String[100000];
		System.out.println(Arrays.toString(garbage));
		garbage = null;
		System.gc();//calls the garbage collector in memory
		Runtime.getRuntime().gc();
		
		
		}catch(Exception ex)
		{System.err.println("error");}
		
		
		
		
		
		
	}
	
}
