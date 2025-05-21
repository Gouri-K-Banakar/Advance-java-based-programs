// Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations with different functions directed as
//follows
//1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
//size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
package javaass;
import java.util.*;
public class ListOpsDemo {
	  public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<>();
	        LinkedList<String> linkedList = new LinkedList<>();

	        // 1. Adding elements
	        addElements(arrayList);
	        addElements(linkedList);

	        // 2. Add element at specific index
	        addAtIndex(arrayList, 1, "Mango");
	        addAtIndex(linkedList, 1, "Mango");

	        // 3. Add multiple elements
	        addMultiple(arrayList, Arrays.asList("Pineapple", "Grapes"));
	        addMultiple(linkedList, Arrays.asList("Pineapple", "Grapes"));

	        // 4. Accessing elements
	        System.out.println("Access from ArrayList: " + accessElement(arrayList, 2));
	        System.out.println("Access from LinkedList: " + accessElement(linkedList, 2));

	        // 5. Updating elements
	        updateElement(arrayList, 0, "Kiwi");
	        updateElement(linkedList, 0, "Kiwi");

	        // 6. Removing elements
	        removeElement(arrayList, "Banana");
	        removeElement(linkedList, "Banana");

	        // 7. Searching elements
	        System.out.println("Apple in ArrayList: " + searchElement(arrayList, "Apple"));
	        System.out.println("Apple in LinkedList: " + searchElement(linkedList, "Apple"));

	        // 8. List size
	        System.out.println("ArrayList size: " + arrayList.size());
	        System.out.println("LinkedList size: " + linkedList.size());

	        // 9. Iterating over list
	        iterateList(arrayList);
	        iterateList(linkedList);

	        // 10. Using Iterator
	        useIterator(arrayList);
	        useIterator(linkedList);

	        // 11. Sorting
	        sortList(arrayList);
	        sortList(linkedList);

	        // 12. Sublist
	        System.out.println("Sublist of ArrayList: " + arrayList.subList(0, 2));
	        System.out.println("Sublist of LinkedList: " + linkedList.subList(0, 2));

	        // 13. Clearing the list
	        arrayList.clear();
	        linkedList.clear();
	        System.out.println("ArrayList cleared: " + arrayList);
	        System.out.println("LinkedList cleared: " + linkedList);
	    }

	    static void addElements(List<String> list) {
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	    }

	    static void addAtIndex(List<String> list, int index, String element) {
	        list.add(index, element);
	    }

	    static void addMultiple(List<String> list, List<String> elements) {
	        list.addAll(elements);
	    }

	    static String accessElement(List<String> list, int index) {
	        return list.get(index);
	    }

	    static void updateElement(List<String> list, int index, String newValue) {
	        list.set(index, newValue);
	    }

	    static void removeElement(List<String> list, String element) {
	        list.remove(element);
	    }

	    static boolean searchElement(List<String> list, String element) {
	        return list.contains(element);
	    }

	    static void iterateList(List<String> list) {
	        System.out.println("Iterating: ");
	        for (String item : list) {
	            System.out.println(item);
	        }
	    }

	    static void useIterator(List<String> list) {
	        System.out.println("Using Iterator: ");
	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }

	    static void sortList(List<String> list) {
	        Collections.sort(list);
	        System.out.println("Sorted List: " + list);
	    }
	

}
