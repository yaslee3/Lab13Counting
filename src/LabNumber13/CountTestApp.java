package LabNumber13;

public class CountTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Counting alligators...");

//add an Alligator class that implements a countable interface to display 
		Alligator all = new Alligator();
		
		//count an alligator object 3 times
		
		CountUtil.count(all,3);
		
		System.out.println();
		Sheep blackie = new Sheep("Blackie");
		CountUtil.count(blackie, 2);

		System.out.println();
		Sheep dolly = (Sheep) blackie.clone();
		dolly.setName("Dolly");
		dolly.resetCount();
		CountUtil.count(dolly, 3);

		System.out.println();
		blackie.resetCount();
		System.out.println(blackie.getCountString());
	}

}
