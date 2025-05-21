/*Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/

package javaass;

public class NullOrEmptyCheck {
	
	    // User-defined function
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        String test1 = null;
	        String test2 = "   ";
	        String test3 = "Hello";

	        System.out.println("Test1 is null or empty? " + isNullOrEmpty(test1));
	        System.out.println("Test2 is null or empty? " + isNullOrEmpty(test2));
	        System.out.println("Test3 is null or empty? " + isNullOrEmpty(test3));
	    }
	}


