package javaass;

public class StringTruncator {
	
	    // User-defined function to truncate string and add ellipsis
	    public static String truncate(String input, int maxLength) {
	        if (input == null || maxLength < 3) {
	            return "";
	        }
	        if (input.length() <= maxLength) {
	            return input;
	        }
	        return input.substring(0, maxLength - 3) + "...";
	    }

	    public static void main(String[] args) {
	        String longText = "Java programming is powerful and versatile.";
	        String result = truncate(longText, 20);

	        System.out.println("Original: " + longText);
	        System.out.println("Truncated: " + result);
	    }
	}


