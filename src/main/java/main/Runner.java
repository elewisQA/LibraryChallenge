package main;

import java.util.Scanner;

public class Runner {
	static Scanner sc;

	public static void main(String[] args) {
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
			case "SELECT" : break;
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
	
}
