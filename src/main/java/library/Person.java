package library;

import java.util.ArrayList;

public class Person {
	//---[ Class Variables ]---
	private String firstName, secondName;
	private ArrayList<Item> checkedOut;
	
	//---[ Class Constructors ]---
	public Person() {
		checkedOut = new ArrayList<Item>();
	}
	
	public Person(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
		checkedOut = new ArrayList<Item>();
	}

	//---[ Class Methods ]---
	@Override
	public String toString() {
		return firstName + " " + secondName + " | Checked-Out: ";
	}
}
