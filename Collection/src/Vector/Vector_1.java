package Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {

		Vector vc = new Vector();
		Vector <String> vc1 = new Vector();
		
		vc.add("Raj");
		vc.add("Rushi");
		vc.add("Kajal");
		vc.add("Prachi");
		vc.add("Pooja");
		vc.add("Ankita");
	
		
		System.out.println(vc);
		
		
		vc.remove(15.5);
		System.out.println(vc);

		vc.isEmpty();
		System.out.println(vc.isEmpty());
		
		vc.set(4, "Puja");
		System.out.println(vc);

		
		vc.get(5);
		System.out.println(vc.get(5));
		System.out.println(".......................................................");
		
		Collections.shuffle(vc);
		System.out.println(vc);
		
		Collections.sort(vc);
		System.out.println(vc);

		Collections.sort(vc,Collections.reverseOrder());
		System.out.println(vc);

		
		System.out.println(vc.size());
		


				
		for (int i=0; i<vc.size();i++) {
			
			System.out.println(vc.get(i));
		}
		System.out.println(".............................");
			
		for(Object str:vc) {
			System.out.println(str);
		}
		System.out.println(".............................");

		Iterator it = vc.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());

		}
		
	
		
	Vector VC = new Vector(); //Homo +Int
	
	//VC.add("WW");
	VC.add(3);
	VC.add(4);
	VC.add(5);
	VC.add(10);
	VC.add(12);
	VC.add(14);
	VC.add(44);
	VC.add(48);
	
	System.out.println(VC);
	
	System.out.println(VC.size());
	
	//Remove 
	VC.remove(4);
	System.out.println(VC);
	
	System.out.println(VC.get(5));
	
	//Update 
	VC.set(3, 100);
	System.out.println(VC);
	
	//add element 
	VC.add(3, 222);
	System.out.println(VC);
	System.out.println();
	for(int i=0;i<VC.size();i++) {
		System.out.println(VC.get(i));
	}
	
	System.out.println();

	for(Object it1 :VC) {
		 System.out.println(it1);	
		}
		
		System.out.println();
		
		Iterator it1 = VC.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}



}
