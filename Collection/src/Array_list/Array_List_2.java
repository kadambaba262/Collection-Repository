package Array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List_2 {

	public static void main(String[] args) {

				ArrayList AL  = new ArrayList();  
				
				AL.add("D");
				AL.add("B");
				AL.add("A");
				AL.add("X");
				
				System.out.println(AL);
				
				ArrayList Duplicate  = new ArrayList();  
				
				//1. Addall
				Duplicate.addAll(AL);
				System.out.println(Duplicate);

				//Remove all
				
				Duplicate.removeAll(AL);
				System.out.println(Duplicate);
				System.out.println(Duplicate.isEmpty());
				
				//Collections Methods
				System.out.println(AL);
				Collections.sort(AL);
				System.out.println(AL);
				
				Collections.sort(AL,Collections.reverseOrder());
				System.out.println(AL);
				
				Collections.shuffle(AL);
				System.out.println(AL);
		}

	}


