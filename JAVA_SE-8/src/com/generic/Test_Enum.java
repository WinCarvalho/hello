package com.generic;

enum Priority{
	MIN,MAX,NRM;
}

enum Table{
	ONE(1), TWO(2),Three(3);
private int x;
private Table(int x) {
	this.x = x;
}
public int getX() {
	return x;
} 

}

enum Weekdays {
	SUN(0),MON(1),TUE(2);
	private int day;
	
	private Weekdays(int day) {
		this.day=day;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day=day;
	}
	
}

public class Test_Enum {

}
