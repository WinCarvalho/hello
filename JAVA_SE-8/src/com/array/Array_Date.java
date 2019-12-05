package com.array;

import java.util.Arrays;

import com.classes.Date;

public class Array_Date {

	public static void main(String[] args) {
		Date today= new Date(1,12,1999);
		
		//creating object array
		Date[] dates = new Date[3];
		System.out.println(Arrays.toString(dates));
		
		dates[0] = new Date(1, 12, 2000);
		dates[1] = new Date(12, 12, 2000);
		dates[2] = new Date(13, 12, 2000);
		System.out.println(Arrays.toString(dates));

		//index based for loop
		for(int index=0 ;index < dates.length;index++ ) {
			System.out.println(dates[index]);
		
		}
		/*
		//enhanced for loop
		
		for(Date date:dates) {
			System.out.println(dates);
		}
		*/
		
		
	}
	
	
}
