*/Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/
	
	package adjjava;
import java.util.ArrayList;

public class ColorSearchDemo {
	
	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Red");
	        colors.add("Yellow");

	        // Check if "Red" is in the list
	        if (colors.contains("Red")) {
	            System.out.println("Color 'Red' is available.");
	        } else {
	            System.out.println("Color 'Red' is not available.");
	        }
	    }
	}


