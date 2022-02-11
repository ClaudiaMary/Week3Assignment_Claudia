package week3.assignmt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};
				List <Integer> list = new ArrayList<Integer>();

				// Sort the array	
				for (int i =0; i <arr.length; i ++) {
					list.add(arr[i]);
					System.out.println(list.get(i));
				}
					
				Collections.sort(list);
				
				System.out.println("The sorted array list");
				
				for (int j=0; j<list.size();j++) {
					System.out.println(list.get(j));
				}
				
				
				int j=1;
				
				for (int k =0; k <arr.length-1; k ++) {
					
					if (j!=arr[k]) {
						System.out.println("The missing element in array  " + j);
					}
					j++;
					
				}
				
				
				
	}

}
