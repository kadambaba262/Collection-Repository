package Array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_List_3 {

	public static void main(String[] args) {

		String arr[]  = {"Dog", "Elephant", "Cat"};
		
		//System.out.println(arr);
		
		for(String name :arr) {
			System.out.println(name);
		}
		
		// Converting array into arrayList
		
		ArrayList Al = new ArrayList(Arrays.asList(arr));
		System.out.println(Al);
}

}


