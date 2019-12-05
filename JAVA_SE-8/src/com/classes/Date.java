package com.classes;

public class Date {

	//final,setter getter to cotrol feild values, this keyword usage
	// feilds
	private int day, month, year;
	private final int START_DAY = 1;
	private final int START_MONTH = 1;
	private final int START_YEAR = 1;

	// constructor

	public Date() {
		setDay(1);
		setMonth(1);
		setYear(1950);
		System.out.println("Date...default");

	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		/*
		 * setDay(day); setMonth(month); setYear(Year);
		 */
		System.out.println("Date...parametar");
	}

	// getter//setter method

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = START_DAY;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;

		} else {
			this.day = START_MONTH;
		}
	}

	public int getYear() {

		return year;
	}

	public void setYear(int year) {
		if (year >= 1 && year <= 2000) {
			this.year = year;
		} else {
			this.day = START_YEAR;
		}
	}
	
	@Override 
	public String toString() {
		return super.toString() + "Date [ Day"+ day +"\tMonth "+ month + "\tyear "+ year +"]" ;
		//return "Date [ Day"+ day +"\tMonth "+ month + "\tyear "+ year +"]" ;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		//today.equals(null)
		if(obj == null) return false;
		
		//today.equals(today)
		if(this == obj) return true;
		
		//today.equals(new Ciecle());
		if(!(obj instanceof Date)) return false;
		
		
		Date otherdate = (Date)obj;
		if(day == otherdate.getDay())
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		Date today = new Date(1,12,1999);
		Date yesterday = new Date(12,12,1999);
		System.out.println(today);
		System.out.println(yesterday);
		
		if(today.equals(yesterday))
			System.out.println("equal");
		else
			System.out.println("Not equal");
		System.out.println(today);
		
		
		
	}
	
	
	
	
}
