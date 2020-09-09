package library;

public class Video extends DigitalMedia implements utils.listenable{
	//---[ Variables ]---
	private double runtime;
	private String audio, description;
	
	//---[ Constructors ]---
	public Video(String name, double runtime) {
		super(name);
		this.runtime = runtime;
	}
	
	//---[ Class Methods ]---
	public void setRuntime(double runtime, int accessLevel) {
		if (accessLevel == 2) {
			this.runtime = runtime;
			System.out.println("INFO: Runtime updated");
		} else {
			System.out.println("WARNING: Incorrect Access Level");
		}
	}
	
	public double getRuntime() {
		return runtime;
	}
	
	public void setDescription(String description, int accessLevel) {
		if (accessLevel == 2) {
			this.description = description;
			System.out.println("INFO: Description updated");
		} else {
			System.out.println("WARNING: Incorrect Access Level");
		}
		
	}
	
	public String getDescription() {
		return description;
	}

	public void playSound() {
		System.out.println(audio);	
		
	}

	public String getSound() {
		return audio;
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
