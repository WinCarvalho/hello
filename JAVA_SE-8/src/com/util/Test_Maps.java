package com.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test_Maps {
 public static void main(String[] args) {
	
	 Map<Integer,String> map= new HashMap<Integer,String>();
	 map.put(101, "Akbar");
	 map.put(102, "Abar");
	 map.put(103, "Akar");
	 map.put(104, "Akba");
	 
	 System.out.println("Size: "+ map.size()+" "+map);
	 
	 //contains(key)
	 System.out.println("Contains? 102 "+map.containsKey(102));

	 //remove
	 map.remove(102);
	 System.out.println("Size: "+ map.size()+" "+map);
	 
	 
	 //get all keys
	 System.out.println("Getting all keys");
	 Set<Integer> keyset = map.keySet();
	 keyset.forEach(System.out::println);
	 
	 //get all values
	 System.out.println("Getting all values");
	 Collection<String> values = map.values();
	 values.forEach(System.out::println);
	 
	 //get all  keys and values
	 Set<Entry<Integer,String>> entryset = map.entrySet();
	 System.out.println("101 : Amar");
	 
	 //1.method
	 for(Map.Entry<Integer, String>entry:entryset) {
		 System.out.println(entry.getKey()+":"+entry.getValue());
	 }
	 
	 //2.method
	 Iterator<Entry<Integer,String>> itr = entryset.iterator();
	 while(itr.hasNext()) {
		 Entry<Integer,String> next = itr.next();
		 System.out.println(next.getKey()+""+next.getValue());
	 }
	 
 }
}
