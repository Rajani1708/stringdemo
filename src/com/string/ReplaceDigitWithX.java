package com.string;

    public class ReplaceDigitWithX{
	
	     public static void main(String [] args) {
	    	 
	    	String str = new String("There are 65 apples in 8 bags");
	    	for (int i = 0; i < str.length(); i ++) {
	    		if (str.charAt(i)>= '0' && str.charAt(i)<='9') {
	    			
	    			str =str.replace(str.charAt(i), 'X');
	    		}
	    		
	    		
	    	}
	
	    		System.out.println(str);
}
	     
	     
}   
