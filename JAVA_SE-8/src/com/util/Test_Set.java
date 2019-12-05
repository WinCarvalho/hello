package com.util;

import java.util.HashSet;
import java.util.TreeSet;

public class Test_Set {

	public static void main(String[] args) {
		HashSet<Integer> set =new HashSet<Integer>();
		
		set.add(111);
		System.out.println("111".hashCode());
		set.add(112);
		System.out.println("112".hashCode());
		set.add(114);
		System.out.println("114".hashCode());
		set.add(113);
		System.out.println("113".hashCode());
		set.add(115);
		System.out.println("115".hashCode());
		System.out.println("size:"+set.size()+":"+set);
		
		TreeSet<String> set1 =new TreeSet<String>();
		set1.add("JAN");
		set1.add("FEB");
		set1.add("MAR");
		System.out.println("size"+set1.size()+" "+set1);
	}
}
