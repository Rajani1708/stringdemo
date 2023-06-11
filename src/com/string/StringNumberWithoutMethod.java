package com.string;

import java.util.regex.Matcher;// press cltl+space
import java.util.regex.Pattern;
 // imp ******interview question

public class StringNumberWithoutMethod {
	
	//Find number from string without using any string class method.
	
			public static void main(String[]args) {
					String s = "H3ll0 T35tin9 5hastra";
					Pattern p = Pattern.compile("[0-9]");// Anything from 0 to 9
					int result = 0;
					Matcher m = p.matcher(s);
					while (m.find() ) {
						
						result = result+ Integer.parseInt(m.group());
						
		}
					System.out.println("Addition: "+result);
}
}

// 