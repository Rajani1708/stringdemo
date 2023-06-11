package com.string;

public class Stringbuffer {

	
	public static void main(String[] args) {
		
		String s = new String ("Hello");
		s.concat("Testing shastra");
		
		 StringBuffer sb = new StringBuffer("Hello");
		 sb.append("Testing Shastra");

		
		System.out.println("String s: "+s);//  Hello
		System.out.println("StringBuffer sb"+sb);// Hello Testing Shastra
		
		// stringbuffer main original main change hota hai
		
		
		
		
	}
	
	
	
}
