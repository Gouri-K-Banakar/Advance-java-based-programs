package javaass;

public class SubstringCounter {
		    // User-defined function to count occurrences
	    public static int countOccurrences(String mainStr, String subStr) {
	        int count = 0;
	        int index = 0;

	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length(); // Move past the last found substring
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        String mainString = "Java is fun. Java is powerful. Java is popular.";
	        String substring = "Java";

	        int occurrences = countOccurrences(mainString, substring);
	        System.out.println("The substring '" + substring + "' appears " + occurrences + " times.");
	    }
	}


