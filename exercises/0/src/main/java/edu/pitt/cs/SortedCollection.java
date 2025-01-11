package edu.pitt.cs;

//TODO: Import libraries as needed
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class SortedCollection {
	// TODO: Add member variables or methods as needed
	int smallest;
	//checking changes
	LinkedList<Integer> coll = new LinkedList<>();
	/**
	 * Adds the number n to the collection.
	 * 
	 * @param n the number to add to the collection--mv
	 * @return always returns true
	 */
	public boolean add(int n) {
		// TODO: Implement
		coll.add(n);
		return true;
	}

	/**
	 * Removes the smallest number in the collection and returns it.
	 * If the collection is empty, throws a NoSuchElementException.
	 * 
	 * @return the smallest number in the collection
	 */
	public int remove() throws NoSuchElementException {
		// TODO: Implement
		if (coll.isEmpty()) {
			throw new NoSuchElementException();
		}
		int tempSmall = Integer.MAX_VALUE;
		int location = Integer.MAX_VALUE;
		for (int k = 0; k < coll.size(); k++) {
			if (coll.get(k) < tempSmall) {
				location = k;
				tempSmall = coll.get(k);	
			}
		}
		coll.remove(location);
		return tempSmall;
	}

	/**
	 * Prints usage information.
	 */
	public static void showUsage() {
		System.out.println("Usage: java SortedCollection [num1] [num2] [num3] ...");
	}

	/**
	 * Main method. Receives a list of numbers as commandline arguments and prints
	 * out the list in sorted order from smallest to largest.
	 * 
	 * @param args commandline arguments; see showUsage() for detailed information
	 */
	public static void main(String[] args) {
		SortedCollection collection = new SortedCollection();
		if (args.length == 0) {
			showUsage();
			return;
		}
		
		// TODO: add numbers in commandline arguments to collection using the add(int) method.
		// If any commandline argument is not a number, call showUsage() and return.
		//find the commandline arguements
		for (int j = 0; j < args.length; j++) {
			//save temp value
			int saving;
			//try to convert to int
			try {
				saving = Integer.parseInt(args[j]);
				//collection.add(saving);
			} catch (Exception e) {
				//if not, and gives error die
				showUsage();
				return;
			}
			//adds to collection
			collection.add(saving);
		}

		System.out.print("sorted: ");
		for (int i = 0; i < args.length; i++) {
			int num = collection.remove();
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
