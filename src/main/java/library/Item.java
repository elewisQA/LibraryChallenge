package library;

public abstract class Item {
	protected int cid;
	protected String name;
	
	//---[ Class Methods ]---
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
