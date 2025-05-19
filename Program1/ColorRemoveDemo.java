package adjjava;
import java.util.ArrayList;
public class ColorRemoveDemo {
	

	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Original list: " + colors);

	        // Remove the 2nd element (index 1)
	        colors.remove(1);
	        System.out.println("After removing 2nd element: " + colors);

	        // Remove "Blue" by value
	        colors.remove("Blue");
	        System.out.println("After removing 'Blue': " + colors);
	    }
	}


