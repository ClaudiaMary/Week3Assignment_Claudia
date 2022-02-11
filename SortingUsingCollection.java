package week3.day1.classassign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {
		
		List<String> cname = new ArrayList<String>();
		cname.add("HCL");
		cname.add("Wipro");
		cname.add("Aspire Systems");
		cname.add("CTS");
			
			
		System.out.println(cname.size());
		Collections.sort(cname);
		for (String eachname:cname) {
			System.out.println(eachname);
		}
		
		Collections.reverse(cname);
		for (String eachrevname:cname) {
			System.out.println(eachrevname);
		}
		
	}

}
