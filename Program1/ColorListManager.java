package adjjava;
import java.util.ArrayList;

public class ColorListManager {
	
	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Original list: " + colors);

	        int n = 2; // For example, remove the 3rd element (index 2)

	        if (n >= 0 && n < colors.size()) {
	            colors.remove(n);
	            System.out.println("After removing element at index " + n + ": " + colors);
	        } else {
	            System.out.println("Invalid index: " + n);
	        }
	    }
	

}
