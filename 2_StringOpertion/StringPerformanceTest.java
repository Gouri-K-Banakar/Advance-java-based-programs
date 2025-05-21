*/Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/
	
	package javaass;

public class StringPerformanceTest {
	
	    public static void main(String[] args) {
	        int iterations = 10000;
	        String appendStr = "AIET";

	        // Test StringBuffer
	        StringBuffer sbuffer = new StringBuffer();
	        long startTime = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            sbuffer.append(appendStr);
	        }
	        long endTime = System.nanoTime();
	        long durationBuffer = endTime - startTime;
	        System.out.println("StringBuffer time: " + durationBuffer + " ns");

	        // Test StringBuilder
	        StringBuilder sbuilder = new StringBuilder();
	        startTime = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            sbuilder.append(appendStr);
	        }
	        endTime = System.nanoTime();
	        long durationBuilder = endTime - startTime;
	        System.out.println("StringBuilder time: " + durationBuilder + " ns");

	        // Justification
	        if (durationBuilder < durationBuffer) {
	            System.out.println("StringBuilder is faster because it is not synchronized.");
	        } else {
	            System.out.println("StringBuffer is faster or comparable, but usually slower due to synchronization overhead.");
	        }
	    }
	}


