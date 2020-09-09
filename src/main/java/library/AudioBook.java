package library;

public class AudioBook extends DigitalMedia implements utils.listenable{
	//---[ Class Variables ]---
	private double runtime;
	private Author author;
	private String audio;
	
	//---[ Constructors ]---
	public AudioBook(String name, Author author, double runtime) {
		super(name);
		this.author = author;
		this.runtime = runtime;
	}

	public void playSound() {
		// TODO Auto-generated method stub
		
	}

	public String getSound() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSound(String audio, int accessLevel) {
		if (accessLevel == 2) {
			this.audio = audio;
			System.out.println("INFO: Audio updated");
		} else {
			System.out.println("WARNING: Incorrect Access Level");
		}
		
	}
	
}
