package com.lang;

import java.util.Arrays;

public class _String {
	public static void main(String[] args) {
		String message = "LTI- JAVA BATCH";
		final char[] value = { 'L', 't', 'I' }; // internally how string is stored
		System.out.println(message.charAt(0));
		System.out.println(message.charAt(1));
		System.out.println(message.charAt(2));

		String lower = message.toLowerCase();
		System.out.println("lower" + message.toLowerCase());
		System.out.println("upper" + message.toUpperCase());
//substring
		System.out.println(message.substring(5,12));
		
		char[] aplha = message.toCharArray();
		System.out.println(Arrays.toString(aplha));
		
		char[] vowels = {'A','E','I','O','U'};
		String strvowels = new String(vowels);
		System.out.println("string vowels"+strvowels);
		
		message= "please find vowels within me...";
		vowels = message.toCharArray();
		
		for (int index =0 ; index < vowels.length; index++)
		{
			if(vowels[index]=='a'||vowels[index]=='o'||vowels[index]=='i'||vowels[index]=='e'||vowels[index]=='u')
			{
				
				System.out.println(vowels[index]);
				
			}
		}
		
		
		
	}
}
