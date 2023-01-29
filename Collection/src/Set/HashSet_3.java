package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_3 {

	public static void main(String[] args) {

		
		HashSet HS  = new HashSet(); // DC - 16 and LF - 0.75, Hetro
		
		HashSet HS1 = new HashSet(200,(float) 0.90);  // Hetro
		
		HashSet<String> HS2 =new HashSet<String>();  // Homo
		
		HS.add(100);
		HS.add("Java");
		HS.add(12.5);
		HS.add('D');
		HS.add(true);
		HS.add(100);   //Duplicate
		HS.add(null);  // Dup
		HS.add(null);
		
		System.out.println(HS);
		
		System.out.println(HS.add("Java"));   // False  ,True
		System.out.println(HS);          
		
       //if u r trying to add duplicate element then it will return false		
	   //if the element is not present in hashset that time it will return true.
	
		//Remove
		HS.remove('D');
		System.out.println(HS);
		HS.remove(2);

		//Set & get MEthods are not present in hashset
		
		//Contains
		System.out.println(HS.contains("Java"));   // True
		System.out.println(HS.contains("Python"));  //Fasle
		
	   //isempty
		System.out.println(HS.isEmpty());  //False
		System.out.println(HS1.isEmpty());
		
		// Iterator
		Iterator it = HS.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	

}
