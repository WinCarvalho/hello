package com.lang;

import java.util.Arrays;
import java.util.Properties;

public class _System {
public static void main(String[] args) {
	int [] array1= {10,20,30};
	int [] array2= {100,200,300,343,0,0};

System.out.println(Arrays.toString(array1));
System.out.println(Arrays.toString(array2));

System.arraycopy(array1,0,array2, 3,array1.length);

System.out.println(Arrays.toString(array1));
System.out.println(Arrays.toString(array2));

System.out.println("current time milli"+ System.currentTimeMillis());
//printing system properties
Properties props = System.getProperties();
props.list(System.out); //dump all system propertis from sytem

//acessing individual properties from system
System.out.println("os name"+System.getProperty("os.name"));
System.out.println("file saparator"+System.getProperty("file.saparator"));
System.out.println("java sversion"+System.getProperty("java.version"));











}
}
