*/Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
	
package javaass;

public class StringReverser {
	
	    // User-defined function to reverse a string
	    public static String reverseString(String input) {
	        StringBuilder sb = new StringBuilder(input);
	        return sb.reverse().toString();
	    }

	    public static void main(String[] args) {
	        String original = "Java Programming";
	        String reversed = reverseString(original);
	        System.out.println("Original String: " + original);
	        System.out.println("Reversed String: " + reversed);
	    }
	}


