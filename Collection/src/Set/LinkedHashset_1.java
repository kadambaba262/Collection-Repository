package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset_1 {

	public static void main(String[] args) {
		
     LinkedHashSet LHS = new LinkedHashSet();
		
		//Same methods are implemented Which are present in hashset
		//Duplicate elements are not allowed
		//insertion order is preserved
		//default capacity & LF - 16 & 0.75
		
		LHS.add(200);
		LHS.add(300);
		LHS.add(400);
		LHS.add(500);
		
		System.out.println(LHS);
		
		System.out.println(LHS.add(300));  //False
        System.out.println(LHS.add(404));   //true
        
        // 1. Add 
        LHS.add("Sita");
        System.out.println("Add Sita - "+LHS);
        
        // 2. remove
        
        LHS.remove("Sita");
        System.out.println("Remove Sita -"+LHS);
        
        // 3. isempty 
        
        LHS.isEmpty();
        System.out.println("is empty  -"+LHS.isEmpty());
        
        // 4. Contains
      
       System.out.println(LHS.contains(400));
       
       // 5. for each loop
       
      for(Object obj:LHS) {
    	  System.out.println(obj);
      }
      LinkedHashSet LHS2 = new LinkedHashSet();
      // 6. Add All
      
      LHS2.addAll(LHS);
      System.out.println(LHS2);
      System.out.println(LHS);
      
      // 7. Remove 
      
      LHS2.removeAll(LHS2);
      System.out.println(LHS2);
      
      
      // 8. iterator
      System.out.println("..........................................");
      
      Iterator it = LHS.iterator();
      while(it.hasNext()) {
    	  System.out.println(it.next());
      }
    		  


	}

}
