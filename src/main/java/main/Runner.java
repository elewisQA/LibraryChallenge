package main;

import java.util.Scanner;

public class Runner {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.println("1. Librarian\n2.Customer\n3.Exit");
			String input = sc.nextLine();
			switch (input.toUpperCase()) {
			case "LIBRARIAN" : break;
			case "CUSTOMER" : break;
			case "EXIT" : break;
			default : System.out.println("Can't interpret. Please try again.\n");
			}
		}

	}

}
