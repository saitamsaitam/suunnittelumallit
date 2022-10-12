package strategy;

public class Main {

	public static void main(String[] args) {

		
		List list = new List();
		
		ListOne listOne = new ListOne();
		ListTwo listTwo = new ListTwo();
		ListThree listTree = new ListThree();

		System.out.println(listOne.listToString(list.listOfNumbers()));
		
		System.out.println(listTwo.listToString(list.listOfNumbers()));
		
		System.out.println("\n"+listTree.listToString(list.listOfNumbers()));
	}

}
