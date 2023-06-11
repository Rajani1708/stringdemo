package com.string;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println("Enter a string to check for palindrome");
		Scanner sc = new Scanner(System.in);
		String input =sc.next();
		String rev ="";
		
		for(int i = input.length()-1; i>=0; i--) {
			rev = rev+input.charAt(i);
			rev =rev.concat(input.charAt(i)+"");		
			
	}
	
	if(input.equals(rev)) {
			System.out.println(input+"is a palindromr");
			
	}else {
		System.out.println(input+"is not palindrom"); 
	}
		sc.close();
	}		
}