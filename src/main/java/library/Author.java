package library;

public class Author {
	private String forname, surname;

	//---[ Constructors ]---
	public Author() {
		
	}
	
	public Author(String forname) {
		this.forname = forname;
	}
	
	public Author(String forname, String surname) { 
		this.forname = forname;
		this.surname = surname;

	}
}
