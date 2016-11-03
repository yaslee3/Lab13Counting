package LabNumber13;

public class CountUtil {

	public static void count(Countable c, int maxCount) {
		System.out.println(c.getCountString());
		while (c.getCount() < maxCount) {
			c.incrementCount();
			System.out.println(c.getCountString());
		}
	}

}
