package arraybasicquestion;

import java.util.Scanner;

//Question: Write a Java program to reverse an array in-place.

//public class Question2 {
//	
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int arr[] = new int[5];
//		int[] reversearray = new int[arr.length];
//		
//		System.out.println("Enter array Element of size 5 :");
//		int i, j;
//		for( i =0; i<arr.length; i++) {
//			
//			arr[i] = sc.nextInt();
//		}
//		
//		System.out.println("Reverse array is : ");
//		for(i = 0, j = arr.length-1; j>=0; i++, j-- ) {
//			reversearray[i] =arr[j];
//			System.out.print(reversearray[i]+" ");
//			
//		}
//		
//		
//	}
//
//}
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 3, 2, 5, 3};
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}

