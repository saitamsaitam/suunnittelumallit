package a;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberList {

	ArrayList<Integer> numbers = new ArrayList<Integer>();

	
	
	public NumberList() {
		addNumbers();
	}
	
	
	public void addNumbers() {
		
		for(int i = 1; i <= 20; i++) {
			numbers.add(i);
		}
	}
	

	public void iterate() {

		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			System.out.println("Thread 1 : " +it.next());
		}
	}

	public void iterate2() {

		Iterator<Integer> it2 = numbers.iterator();
		while (it2.hasNext()) {
			System.out.println("Thread 2 : " + it2.next());
		}
	}
	
	
}
