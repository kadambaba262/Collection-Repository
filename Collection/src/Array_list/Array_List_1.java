package Array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_1 {

	public static void main(String[] args) {
		
//		1. BestChoice- Retrieval operation          1. BestChoice - Insertion & deletion in the middle.
//		2. Worst choice - Insertion & deletion      2. Worst choice  - Retrieval operation 
//		   in the middle. 
//		3. DS - Resizable & growable                3. DS - Doubly LL & Linear type
//		4. Default capacity - 10                    4. No default capacity
//		5. It takes less memory                     5. It takes more memory
		
		ArrayList<String> Al1 = new ArrayList<String>();

		ArrayList A1 = new ArrayList(); // Which contain homo + hetro type obj
		
		// Methods Of ArrayList

	// 1. Add
		A1.add("100"); //int
		A1.add("Ansh");  //String
		A1.add("33.3");  //double
		A1.add("True"); //boolean
		A1.add('R');    // Char
		A1.add("15.5f");  // Float
		
		System.out.println(A1);
		
		// 2. Size
		A1.add("300");
		A1.add("300");
		A1.add(300);
		System.out.println("No. of element given in array list"+ - A1.size());
		
		// 3. Remove
		
		A1.remove(3);
		System.out.println(A1); // By using Index.
		A1.remove("Ansh");
		System.out.println(A1);  // By using Object.
		
		// 4. Insert An Element in Array list
		
		A1.add('R');           // By direct Adding we get that value at last 
		System.out.println(A1);  
		
		A1.add(2, "Java");
		System.out.println(A1);  // By using this (index , Object) we add the element as per required index.
		
		
		// 5. Retrive specific element by using (A1.get)
		
		System.out.println(A1.get(2));
		System.out.println(A1.get(6));
		System.out.println(A1.get(7));
		System.out.println(A1.get(8));
		
		// 6. Change /replace element by using (A1.set)
		
		A1.set(3, 'D');
		System.out.println(A1);
		A1.set(6, 200);
		System.out.println(A1);
		
		//7. isempty
		
		System.out.println(A1.isEmpty());
		System.out.println(Al1.isEmpty());
		
		 System.out.println("Read the element by using for loop");
		 
		 for(int i=0; i<A1.size();i++) {
			 
			 System.out.println(A1.get(i));
			 
			
		 }
		 
		 System.out.println("............................................");
		 for(Object obj :A1) {
		    	System.out.println(obj);
		 
		 }
		 System.out.println("............................................");

		 Iterator  it  = A1.iterator();
		    
		    while(it.hasNext()) {
		    	
		    	System.out.println(it.next());
		    }
		    
		    A1.size();
		    System.out.println(A1);
			System.out.println("No. of element given in array list"+ - A1.size());


	}

}

// 
