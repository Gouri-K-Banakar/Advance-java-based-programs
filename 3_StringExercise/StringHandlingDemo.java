
*/Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/
	
	package javaass;

public class StringHandlingDemo {
	
	    public static void main(String[] args) {

	        // String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1: " + str1.charAt(1));

	        // String Comparison
	        System.out.println("str1 equals str2? " + str1.equals(str2));
	        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

	        // String Searching
	        String msg = "Welcome to Java Programming";
	        System.out.println("Index of 'Java': " + msg.indexOf("Java"));
	        System.out.println("Message contains 'to'? " + msg.contains("to"));

	        // Substring Operations
	        System.out.println("Substring (11 to 15): " + msg.substring(11, 15));

	        // String Modification
	        System.out.println("Replace 'Java' with 'Python': " + msg.replace("Java", "Python"));

	        // Whitespace Handling
	        String text = "   Trim Me   ";
	        System.out.println("Before trim: '" + text + "'");
	        System.out.println("After trim: '" + text.trim() + "'");

	        // String Concatenation
	        String full = str1 + " " + str2;
	        System.out.println("Concatenated string: " + full);

	        // String Splitting
	        String data = "Red,Green,Blue";
	        String[] colors = data.split(",");
	        System.out.println("Split colors:");
	        for (String color : colors) {
	            System.out.println(color);
	        }

	        // StringBuilder Demo
	        StringBuilder sb = new StringBuilder("AIET");
	        sb.append(" College");
	        sb.insert(4, " Engineering");
	        System.out.println("StringBuilder result: " + sb.toString());

	        // String Formatting
	        String name = "Alice";
	        int age = 21;
	        System.out.println(String.format("Name: %s, Age: %d", name, age));

	        // Email Validation
	        String email = "student@aiet.edu";
	        boolean validEmail = email.contains("@") && email.startsWith("student") && email.endsWith(".edu");
	        System.out.println("Is email valid? " + validEmail);
	    }
	}


