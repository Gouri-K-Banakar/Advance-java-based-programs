package adjjava;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListIteratorExample {
	

	
	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>();

	        // Adding elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Full list: " + colors);
	        System.out.println("Iterating from 2nd position:");

	        // Starting from index 1 (2nd position)
	        ListIterator<String> iterator = colors.listIterator(1);

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


