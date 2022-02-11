package week3.assignmt;

public class FindIntersection {
	public static void main(String[] args) {
		int[] num = {3,2,11,4,6,7};
		int[] num1={1,2,8,4,9,7,};
		
	int arraylength = num.length;
	int arraylenghtnum1 = num1.length;
	
	for (int i =0; i<arraylength; i++) {
		
		for(int j=0;j<arraylenghtnum1; j++) {
			
			if (num[i]==num1[j]){
				//int[] res = {num[i]};
				System.out.println("The matching numbers are " + num[i]);
			}
			
		}
	}
		

			
	}

}
