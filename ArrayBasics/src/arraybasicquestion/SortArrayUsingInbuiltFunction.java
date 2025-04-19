package arraybasicquestion;

import java.util.Arrays;

public class SortArrayUsingInbuiltFunction {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 3, 5, 7, 6};
		Arrays.sort(arr);
		System.out.println("The sorted array is : ");
		System.out.println(Arrays.toString(arr));

	}

}
