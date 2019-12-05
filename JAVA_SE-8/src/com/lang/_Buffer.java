package com.lang;

public class _Buffer {
public static void main(String[] args) {
	
	String message = "hello";
	message += "added";//works
	StringBuffer buffer = new StringBuffer("i am using SB");
	buffer.append("added1");
	buffer.append("added2");
	buffer.append("added3");
	buffer.insert(15, "all");
	System.out.println(buffer.toString());
	
	StringBuilder builder = new StringBuilder("String Builder");
	System.out.println("Reverse"+builder.reverse());



}
}
