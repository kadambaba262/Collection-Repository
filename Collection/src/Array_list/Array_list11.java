package Array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Array_list11 {

	public static void main(String[] args) {

		ArrayList Al1 = new ArrayList();
		
		Al1.add("A");
		Al1.add("Z");
		Al1.add("D");
		Al1.add("P");
		Al1.add("R");
		System.out.println(Al1);
		
		ArrayList Duplicate = new ArrayList();
		
		//1. addAll method.
		Duplicate.addAll(Al1); // To copy the elements from original array to new duplicate array.
		System.out.println(Duplicate);
		//2.removeAll
		Duplicate.removeAll(Duplicate); // To remove the elements from duplicate array.
		System.out.println(Duplicate);
		Al1.remove(1);
		System.out.println(Al1);
		
		Al1.add(1, "Z");
		System.out.println(Al1);
		
		// Collection Method 
		
		System.out.println("---------------------------------------");
		
		Collections.sort(Al1);
		System.out.println(Al1);
		
		Collections.shuffle(Al1);
		System.out.println(Al1);
		
		Collections.sort(Al1, Collections.reverseOrder());
		System.out.println(Al1);
	
	
	}

}
