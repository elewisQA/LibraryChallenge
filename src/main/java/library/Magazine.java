package library;

public class Magazine extends WrittenMedia {
	//---[ Class Variables ]---
	private int edition;
	
	//---[ Class Constructors ]---
	public Magazine(int edition) {
		super();
		this.edition = edition;
	}
	
	public Magazine(String name, int edition) {
		super(name);
		this.edition = edition;
	}
	
	public Magazine(String name, String publisher, int edition) {
		super(name, publisher);
		this.edition = edition;
	}
	
	//---[ Class Methods ]---
	public void setEdition(int edition, int accessLevel) {
		if (accessLevel == 2) {
			this.edition = edition;
			System.out.println("INFO: Edition set");
		} else {
			System.out.println("WARNING: Insufficient Access Level");
		}
	}
	
	public int getEdition() {
		return edition;
	}
}
