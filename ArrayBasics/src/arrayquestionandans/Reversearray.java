package arrayquestionandans;

import java.util.Arrays;

public class Reversearray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] reversearray = new int[arr.length];
		int count = 0;
		
		for(int i = arr.length -1; i>=0; i--) {
			reversearray[count] = arr[i];
			count ++ ;
		}
		System.out.println(Arrays.toString(reversearray));
		
		
		//Alternate and efficient method 
		
		int left = 0, right = arr.length-1;
		
		while(right>left) {
			int tempt = arr[right];
			 arr[right] =arr[left];
			arr[left] = tempt;
			
			left ++;
			right--;
			}
		System.out.println(Arrays.toString(arr));
		

	}

}
