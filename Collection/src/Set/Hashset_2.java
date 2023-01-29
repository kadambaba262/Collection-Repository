package Set;

import java.util.HashSet;

public class Hashset_2 {

	public static void main(String[] args) {

		HashSet<String> HS2 =new HashSet<String>();  // Homo

		HS2.add("Rahul");
		HS2.add("Rohit");
		HS2.add("Hardik");
		HS2.add("Bumrah");
		
		System.out.println(HS2);
	 
		HashSet<String> HS3 =new HashSet<String>();  // Homo
		
		HS3.add("Rahul");
		HS3.add("Rohit");
		HS3.add("Virat");
		HS3.add("Surya");

		System.out.println(HS3);
		
		System.out.println("---------------------------------------------------------------");
		
		// addAll
		HS2.addAll(HS3);
		System.out.println(HS2);
		HS3.addAll(HS2);
		System.out.println(HS3);
		
		System.out.println("..................................................................");
		
		// retainAll
		
		HS3.retainAll(HS2);
		System.out.println(HS3);
		
		System.out.println("..................................................................");

		HS2.containsAll(HS3);
		System.out.println(HS3);
		
	}
}


