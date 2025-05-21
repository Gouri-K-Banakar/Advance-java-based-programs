package javaass;

public class WhitespaceRemover {
	
	    // User-defined function to remove all whitespace characters
	    public static String removeWhitespace(String input) {
	        return input.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        String original = "  Java   Programming \t is \n fun ";
	        String result = removeWhitespace(original);

	        System.out.println("Original String: '" + original + "'");
	        System.out.println("Without Whitespace: '" + result + "'");
	    }
	}


