package com.string;

public class StringNumber {
	
	// Find number from string and add them
	
	public static void main(String[]args) {
		String s = "H3ll0 T35tin9 5hastra";
		int result = 0;
		for (int i = 0; i < s.length(); i ++) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				result = result+(s.charAt(i)-48);
				
				
		}
			
		
			
		}
		
		System.out.println("Addtion: "+result);
	}
	
	
	}


