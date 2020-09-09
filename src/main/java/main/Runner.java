package main;

import java.util.Scanner;
import java.util.ArrayList;
import library.*;

public class Runner {
	//---[ Class Variables ]---
	static Scanner sc;
	static ArrayList<Item> available;
	static ArrayList<Person> people;

	public static void main(String[] args) {
		// Initialize arrays
		available = new ArrayList<Item>();
		populateItems();
		people = new ArrayList<Person>();
		
		// Begin checking for user input
		sc = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.println("--------------------------------");
			System.out.println("Choices:\n"
					+ "1. Select (show items in Library)\n"
					+ "2. Insert (add item to library)\n"
					+ "3. Update (update details of book, etc.\n"
					+ "4. Delete (remove a book from the library)\n"
					+ "5. Checkout (take book from library, give to customer)\n"
					+ "6. Return (take book from customer, give back to library)\n"
					+ "7. Exit");
			System.out.print(">");
			String input = sc.nextLine();
			switch (input.toUpperCase()) {
			case "SELECT" : select(); break;
			case "INSERT" : break;
			case "UPDATE" : break;
			case "DELETE" : break;
			case "CHECKOUT" : break;
			case "RETURN" : break;
			case "EXIT" : loop = false; break;
			default : System.out.println("Can't interpret. Please try again.\n");
			}
		}

	}
	
	public static void select() {
		System.out.println("Show all items or all persons?");
		System.out.print(">");
		String input = sc.nextLine();
		switch (input.toUpperCase()) {
		case "ITEMS" : System.out.println("\nItems:"); for(Item i : available) { System.out.println(i.toString()); } break;
		case "PERSONS" : System.out.println("People:"); for(Person p : people) { System.out.println(p.toString()); }break;
		}
	}
	
	public static void populateItems() {
		Author tolkein = new Author("J.R.R. Tolkein");
		Book hobbit = new Book("The Hobbit", tolkein);
		available.add(hobbit);
		Book fellowship = new Book("Lord of the Rings: Fellowship of the Ring", tolkein, "fantasy");
		available.add(fellowship);
		Magazine pcGamer = new Magazine("PC Gamer");
		available.add(pcGamer);
		Magazine pcGamerTwo = new Magazine("PC Gamer", 1);
		available.add(pcGamerTwo);
		Magazine pcGamerThree = new Magazine("PC Gamer", 5);
		available.add(pcGamerThree);
		Video theMartian = new Video("The Martian", 2.1);
		available.add(theMartian);
		Video interstellar = new Video("Interstellar");
		available.add(interstellar);
	}
	
}
