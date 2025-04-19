package arraybasicquestion;

import java.util.Arrays;

public class SortArrayUsingForLoop {
	public int[] reverseArray(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
		
	}
	
	

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 4, 5, 2, 3, 6};
		System.out.println("The original array is: "+Arrays.toString(arr));
		
		SortArrayUsingForLoop s = new SortArrayUsingForLoop();
		System.out.print("Sorted array is : "+Arrays.toString(s.reverseArray(arr)));
		
		
		
}
}
