package library;

import java.util.ArrayList;

public class Library {
	//---[ Class Variables ]---
	static ArrayList<Item> collection;

	public Library() {
		 collection = new ArrayList<Item>();
	}
	
	public static void addItem(Item item) {
		collection.add(item);
	}
	
	public static void removeItem(Item item) {
		try {
			collection.remove(item);
		} catch (NullPointerException npe) {
			System.out.println("NPE - That item doesn't exist in the collection.");
		} catch (Exception e) {
			System.out.println("E - Something went badly wrong.");
		}
	}
}
