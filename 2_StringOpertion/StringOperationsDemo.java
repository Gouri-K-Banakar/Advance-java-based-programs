*/Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()/*
	
	package javaass;

public class StringOperationsDemo {
	
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("Original Strings: " + str1 + ", " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        System.out.println("str1 equals str2? " + str1.equals(str2));
	        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

	        // 4. String Searching
	        String message = "Welcome to Java Programming";
	        System.out.println("Index of 'Java': " + message.indexOf("Java"));

	        // 5. Substring Operations
	        System.out.println("Substring (11 to 15): " + message.substring(11, 15));

	        // 6. String Modification
	        System.out.println("Replace 'Java' with 'Python': " + message.replace("Java", "Python"));

	        // 7. Whitespace Handling
	        String spaced = "   Trim this   ";
	        System.out.println("Before trim: '" + spaced + "'");
	        System.out.println("After trim: '" + spaced.trim() + "'");

	        // 8. String Concatenation
	        String full = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated: " + full);

	        // 9. String Splitting
	        String colors = "Red,Green,Blue";
	        String[] colorArray = colors.split(",");
	        System.out.println("Splitted colors:");
	        for (String color : colorArray) {
	            System.out.println(color);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" Java");
	        sb.insert(5, " World");
	        System.out.println("StringBuilder result: " + sb);

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 25;
	        System.out.println(String.format("Name: %s, Age: %d", name, age));

	        // 12. Email Validation with contains(), startsWith(), endsWith()
	        String email = "example@gmail.com";
	        boolean isValid = email.contains("@") && email.startsWith("example") && email.endsWith(".com");
	        System.out.println("Is email valid? " + isValid);
	    }
	}


