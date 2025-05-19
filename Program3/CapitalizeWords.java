package javaass;

public class CapitalizeWords {
	
	    // User-defined function to capitalize each word
	    public static String capitalizeWords(String input) {
	        String[] words = input.trim().split("\\s+");
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                           .append(word.substring(1).toLowerCase())
	                           .append(" ");
	            }
	        }

	        return capitalized.toString().trim();
	    }

	    public static void main(String[] args) {
	        String sentence = "java programming is fun";
	        String result = capitalizeWords(sentence);

	        System.out.println("Original: " + sentence);
	        System.out.println("Capitalized: " + result);
	    }
	}


