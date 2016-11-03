package LabNumber13;
// this class takes on the designated behavior that the interface specifies.
public class Alligator implements Countable {
	private int count;

	//Constructor 
	public Alligator () {
		count = 1;
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

	@Override
	public String getCountString() {
		if (count == 1)
			return count + " alligator";
		else
			return count + " alligators";
	}

}
