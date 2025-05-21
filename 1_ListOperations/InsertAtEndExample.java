package adjjava;
import java.util.LinkedList;

public class InsertAtEndExample {
	
	
	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>();

	        // Adding initial elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");

	        System.out.println("Before adding: " + colors);

	        // Insert "Pink" at the end
	        colors.offerLast("Pink");

	        System.out.println("After adding 'Pink' at the end: " + colors);
	    }
	}


