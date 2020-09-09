package library;

import java.util.ArrayList;

public class Person {
	private String firstName, secondName;
	private ArrayList<Item> checkedOut;
	
	public Person() {
		checkedOut = new ArrayList<Item>();
	}
	
	public Person(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
		checkedOut = new ArrayList<Item>();
	}

}
