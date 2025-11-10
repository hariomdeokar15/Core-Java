package arraybasicquestion;

import java.util.Scanner;

public class RemoveDuplicatesFromArray {
	
	public int[] removeduplicate(int[] arr) {
		int[] temp = new int[arr.length];
		int j=0;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		
		RemoveDuplicatesFromArray remove = new RemoveDuplicatesFromArray();
		int[] arr= new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a array of size 5: ");
		for(int i = 0; i<arr.length; i++ ) {
			arr[i] = sc.nextInt();	
		}
		
		int[] newarr =remove.removeduplicate(arr);
		
		System.out.println("After removing duplicates :");
		for(int num: newarr ) {
			System.out.print(num+" ");
		}
		

	}

}
