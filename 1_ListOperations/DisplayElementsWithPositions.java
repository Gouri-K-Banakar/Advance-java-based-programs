*/Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/
	
	package adjjava;
import java.util.LinkedList;

public class DisplayElementsWithPositions {
	
	
	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>();

	        // Adding elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");

	        System.out.println("Elements and their positions:");

	        for (int i = 0; i < colors.size(); i++) {
	            System.out.println("Position " + i + ": " + colors.get(i));
	        }
	    }
	}


