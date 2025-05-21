*/Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/

	
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


