package main;

import java.util.Scanner;

public class Runner {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.println("1. Modify Items\n2.Modify People\n3.Exit");
			String input = sc.nextLine();
			switch (input.toUpperCase()) {
			case "ITEMS" : items(); break;
			case "PEOPLE" : people(); break;
			case "EXIT" : loop = false; break;
			default : System.out.println("Can't interpret. Please try again.\n");
			}
		}

	}
	
	private static void items() {
		boolean loop = true;
		while (loop) {
			System.out.println("Choices:\n"
					+ "1.INSERT\n"
					+ "2.UPDATE\n"
					+ "3.DELETE\n");
			String input = sc.nextLine();
			switch (input.toUpperCase()) {
				case "INSERT" : break;
				case "UPDATE" : break;
				case "DELETE" : break;
				default : System.out.println("Can't interpret. Please try again.\n");
			}
		}
	}
	
	private static void people() {
		boolean loop = true;
		while (loop) {
			System.out.println("Choices:\n"
					+ "1.INSERT\n"
					+ "2.UPDATE\n"
					+ "3.DELETE\n");
			String input = sc.nextLine();
			switch (input.toUpperCase()) {
				case "INSERT" : break;
				case "UPDATE" : break;
				case "DELETE" : break;
				default : System.out.println("Can't interpret. Please try again.\n");
			}
		}
	}
}
