package week3.assignmt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i =0; i <data.length; i ++) {
			list.add(data[i]);
		}
		System.out.println("The array list is " +list);
		Collections.sort(list);
		System.out.println("The ascending order list is " +list);
		System.out.println("The second number from last is " + list.get(4));
	}

}
