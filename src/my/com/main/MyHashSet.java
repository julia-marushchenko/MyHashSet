package my.com.main;
import java.util.HashSet;

public class MyHashSet {
	
	public static void main (String [] str) {
		
		// Creating HashSet for storing items of close
		HashSet<String> mySet = new HashSet<>();
		
		// Checking set size
		System.out.println("New created size of set is " + mySet.size());
		
		// Adding items to mySet
		mySet.add("Dress");
		mySet.add("Pants");
		mySet.add("Shirt");
		mySet.add("T-Shirt");
		mySet.add("Scarf");
		mySet.add("Coat");
		mySet.add("Jacket");
		mySet.add("Top");
		mySet.add("Tie");
		mySet.add("Jeans");
		
		// Printing to console items of mySet
		System.out.println("MySet elements " + mySet.toString());
		
		// Adding Jeans again
		mySet.add("Jeans");
		
		// Printing to console items of mySet to check that Jeans added only 1 time
		System.out.println("MySet elements " + mySet.toString());
		
		// Checking set size
		System.out.println("Size of set after adding elements is: " +mySet.size());
		
		// Removing Jeans from mySet
		mySet.remove("Jeans");
		
		// Printing to console items of mySet
		System.out.println("MySet elements " + mySet.toString());
		
		// Checking if mySet has element Jeans
		System.out.println("Is Jeans in the set: " + mySet.contains("Jeans"));
		
		// Checking if mySet has element Coat
		System.out.println("Is Coat in the set: " + mySet.contains("Coat"));
		
		// Checking if mySet has element Top
		System.out.println("Is Top in the set: " + mySet.contains("Top"));
		
	}

}
