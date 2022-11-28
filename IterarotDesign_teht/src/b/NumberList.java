package b;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberList {

	ArrayList<Integer> numbers = new ArrayList<Integer>();

	Iterator<Integer> it;

	public NumberList() {
		addNumbers();
		it = numbers.iterator();
	}

	public void addNumbers() {

		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}
	}

	public void iterate() {

		while (it.hasNext()) {
			System.out.println("Thread 1 : " + it.next());
		}
	}

	public void iterate2() {

		while (it.hasNext()) {
			System.out.println("Thread 2 : " + it.next());
		}
	}

}
