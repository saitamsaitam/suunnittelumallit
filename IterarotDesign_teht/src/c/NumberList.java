package c;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberList {

	ArrayList<Integer> numbers = new ArrayList<Integer>();

	public NumberList() {
		addNumbers();

	}

	public void addNumbers() {

		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}
	}

	public void iterate() {

		Iterator<Integer> it = numbers.iterator();

		while (it.hasNext()) {
			System.out.println("Thread 1 : " + it.next());

			numbers.remove(4);
		}
	}

	public void iterate2() {

		Iterator<Integer> it = numbers.iterator();

		while (it.hasNext()) {
			
			Integer i = it.next();
			
			if (i < 3) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
