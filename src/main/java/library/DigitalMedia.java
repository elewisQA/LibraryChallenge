package library;

public abstract class DigitalMedia extends Item{
	//---[ Class Constructors ]---
	public DigitalMedia() {
		this.cid = 2; // Category ID for media is always 1
	}
	
	public DigitalMedia(String name) {
		this.cid = 1;
		this.name = name;
	}
}
