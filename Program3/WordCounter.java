package javaass;

public class WordCounter {
	
	    // User-defined function to count words in a string
	    public static int countWords(String input) {
	        if (input == null || input.trim().isEmpty()) {
	            return 0;
	        }
	        // Split by one or more whitespace characters
	        String[] words = input.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String sentence = "Java programming is fun and powerful.";
	        int wordCount = countWords(sentence);

	        System.out.println("Number of words: " + wordCount);
	    }
	}


