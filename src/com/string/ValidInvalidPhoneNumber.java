package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// cheque if the given phone number is valid or invalid without using string class
public class ValidInvalidPhoneNumber {
	
	public static boolean validateMobileNumber(String mobileNumber) {
        // Define the pattern for a valid mobile number
        Pattern pattern = Pattern.compile("^\\d{10}$");
        // Test the mobile number against the pattern
        return pattern.matcher(mobileNumber).matches();
    }
 
    public static void main(String[] args) {
        // Testing the function
        String[] mobileNumbers = {"9876543210", "1234567890", "1234", "12345678901", "123456789a"};
        for (String mobileNumber : mobileNumbers) {
            if (validateMobileNumber(mobileNumber)) {
                System.out.println(mobileNumber + " is a valid mobile number");
            } else {
                System.out.println(mobileNumber + " is an invalid mobile number");
            }
        }
    }
}