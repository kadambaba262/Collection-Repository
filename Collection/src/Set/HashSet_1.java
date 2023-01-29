package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_1<HS> {

	public static void main(String[] args) {

		HashSet HS = new HashSet(); // DC - 16 and LF - 0.75
		HashSet HS1 = new HashSet(); // DC - 16 and LF - 0.75

		HS.add("Raj");
		HS.add(100);
		HS.add(null);
		HS.add('A');
		
	System.out.println("Print  -"+HS);
	
	// 1. Add
	
	HS.add("Rushi");
	System.out.println("Add Rushi - "+HS);
	
	//2. Remove
	
	HS.remove(100);
	System.out.println("Remove 100 - "+HS);
	
	// 3.Set & get Methods are not present in hashset
	
	// 4. Size
	System.out.println("Size - "+HS.size());
	
	// 5. isempty
	
	HS.isEmpty();
	System.out.println("is empty - "+HS.isEmpty());

	// 6. Contains 
	
	HS.contains(HS);
	System.out.println(HS.contains("Raj"));
	
	// 7. Iterator
	System.out.println("Print Element by Using the Iterator");
	
	HS.iterator();
	Iterator it = HS.iterator();
	while(it.hasNext()) {
	System.out.println(it.next());
	}
	
   // 8. For each
	System.out.println("Print Element by Using the for each loop");

	for(Object obj:HS) {
		System.out.println(obj);
	}
	
	// 9. addAll
	
	HS1.addAll(HS);
	System.out.println(HS1);
	
	// 10.removeAll
	HS1.removeAll(HS1);
	System.out.println(HS1);
	System.out.println(HS);
	
	System.out.println(".............................................");
	
	HashSet HS2 = new HashSet();
	
	HS2.add("Raj");
	HS2.add(100);
	HS2.add("Baba");
	HS2.add('A');
	HS2.add(50);
	
	// addAll Method - When We add two HashSet then it will print unique value
	
	System.out.println(HS2);
	HS2.addAll(HS);
	System.out.println(HS2);
	
	// Retain 
	HS.retainAll(HS2);
	System.out.println(HS);

	}
	}
	
