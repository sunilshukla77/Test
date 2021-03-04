import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class GenericTypeEx1 {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>(); // ArrayList holds
															// only String
															// objects.
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("banana");
		// fruits.add(new Integer(10));//C.E. Cannot find symbol add(Integer)

		// Using Iterator
		Iterator<String> ittr = fruits.iterator();
		while (ittr.hasNext()) {
			String fruit = ittr.next();
			System.out.print(fruit + " ");
		}
		System.out.println();

		// Using Enhanced for loop
		for (String fruit : fruits) {
			System.out.print(fruit + " ");
		}
		System.out.println();

		// Using forEach() method in Java 8 and Anonymous inner class
		fruits.forEach(new Consumer<String>() {
			@Override
			public void accept(String fruit) {
				System.out.print(fruit + " ");
			}
		});
		System.out.println();
		
		//Using Lambda expression in Java 8
		fruits.forEach(fruit -> System.out.print(fruit + " "));
		System.out.println();
		
		//Using method ref in Java 8
		fruits.forEach(System.out::println);
	}
}
