package library;

public abstract class WrittenMedia extends Item {
	//---[ Class Variables ]---
	protected String publisher;
	
	//---[ Class Constructors ]---
	public WrittenMedia() {
		this.cid = 1;
	}
	
	public WrittenMedia(String name) {
		this.cid = 1;
		this.name = name;
		publisher = null;
	}
	
	public WrittenMedia(String name, String publisher) {
		this.cid = 1;
		this.name = name;
		this.publisher = publisher;
	}
	
	//---[ Class Methods ]---
	public void setPublisher(String publisher, int accessLevel) {
		if (accessLevel == 2) {
			this.publisher = publisher;
			System.out.println("INFO: Publisher set");
		} else {
			System.out.println("WARNING: Insufficient Access Level");
		}
	}
}
