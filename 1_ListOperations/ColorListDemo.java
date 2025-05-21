/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/

package adjjava;
import java.util.ArrayList;
import java.util.List;
public class ColorListDemo {
	

	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Original list: " + colors);

	        // Extracting 1st and 2nd elements (index 0 and 1)
	        List<String> subList = colors.subList(0, 2);

	        System.out.println("Extracted sublist (1st and 2nd elements): " + subList);
	    }
	}


