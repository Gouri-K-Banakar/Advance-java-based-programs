/*Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/

package javaass;

public class NumericChecker {
	
	    // User-defined function to check if a string is numeric
	    public static boolean isNumeric(String str) {
	        return str != null && str.matches("\\d+");
	    }

	    public static void main(String[] args) {
	        String test1 = "123456";
	        String test2 = "123abc";
	        String test3 = "";

	        System.out.println("'" + test1 + "' is numeric? " + isNumeric(test1));
	        System.out.println("'" + test2 + "' is numeric? " + isNumeric(test2));
	        System.out.println("'" + test3 + "' is numeric? " + isNumeric(test3));
	    }
	}


