package library;

public class Book extends WrittenMedia {
	//---[ Class Variables ]---
	private Author author;
	private String genre;
	
	//---[ Class Constructors ]---
	public Book() {
		super();
	}
	
	public Book(String name, Author author) {
		super(name);
		this.author = author;
		genre = null;
	}
	
	public Book(String name, Author author, String genre) {
		super(name);
		this.author = author;
		this.genre = genre;
	}
	
	public Book(String name, String publisher, Author author) {
		super(name, publisher);
		this.author = author;
		genre = null;
	}
	
	public Book(String name, String publisher, Author author, String genre) {
		super(name, publisher);
		this.author = author;
		this.genre = genre;
	}
	
	//---[ Class Methods ]---
	public void setAuthor(Author author, int accessLevel) {
		if (accessLevel == 2) {
			this.author = author;
			System.out.println("INFO: Author set");
		} else {
			System.out.println("WARNING: Insufficient Access Level");
		}
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void setGenre(String genre, int accessLevel) {
		if (accessLevel == 2) {
			this.genre = genre;
			System.out.println("INFO: Genre set");
		} else {
			System.out.println("WARNING: Insufficient Access Level");
		}
	}
	
	public String getGenre() {
		return genre;
	}
}
