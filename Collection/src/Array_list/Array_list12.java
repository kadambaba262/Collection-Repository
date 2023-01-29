package Array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_list12 {

	public static void main(String[] args) {

		String arr[] = {"Prachi", "Kajal", "Pooja"};
		
		//System.out.println(arr);  we can not get the output of array in this way.
		// To overcame this we use for each loop;
		for(String name:arr) {
			System.out.println(name);
		}
		
		ArrayList A3 = new ArrayList(Arrays.asList(arr));
		System.out.println(A3);
		
		
	
		
	}

}
