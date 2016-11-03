package LabNumber13;

public class Sheep implements Countable, Cloneable {
	private int count;
	private String name;
	
	public Sheep () {
		count = 1;
		name = "";
	}
	
	public Sheep (String n) {
		count = 1;
		name = n;
	}

	
	public String getName() {
		return name;
	}
	
	public void setName (String n) {
		name = n;
	}
	
	@Override
	public void incrementCount() {
		count++;
	}

	@Override
	public void resetCount() {
		count = 1;
	}

	@Override
	public int getCount() {
		return count;
	}
	
	public void setCount(int n) {
		count = n;
	}

	@Override
	public String getCountString() {
		if (count == 1)
			return count + " " + name;
		else
			return count + " " + name;
	}

	@Override
	public Object clone () {
		Sheep copy = new Sheep(this.name);
		copy.setCount(this.count);
		
		return copy;
	}

}
