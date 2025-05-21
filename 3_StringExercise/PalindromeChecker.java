/*Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():/*
	
	package javaass;

public class PalindromeChecker {
	
	    // User-defined function to check palindrome
	    public static boolean isPalindrome(String input) {
	        // Remove non-alphanumeric characters and convert to lowercase
	        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Reverse the cleaned string
	        String reversed = new StringBuilder(cleaned).reverse().toString();

	        return cleaned.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String test1 = "Madam";
	        String test2 = "A man, a plan, a canal: Panama";
	        String test3 = "Hello";

	        System.out.println("'" + test1 + "' is palindrome? " + isPalindrome(test1));
	        System.out.println("'" + test2 + "' is palindrome? " + isPalindrome(test2));
	        System.out.println("'" + test3 + "' is palindrome? " + isPalindrome(test3));
	    }
	}


