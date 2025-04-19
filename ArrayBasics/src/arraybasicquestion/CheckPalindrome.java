package arraybasicquestion;

import java.util.Scanner;

public class CheckPalindrome {
	
	
	
	public boolean checkPalindrome(int[] arr) {
		boolean isPalindrome = true;
		
		for(int i= 0; i<arr.length/2; i++) {
			
			if(arr[i] != arr[arr.length-i-1]) {
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter the array of size 5 to check whether it is palindrome or not");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		CheckPalindrome c= new CheckPalindrome();
		
		boolean result = c.checkPalindrome(arr);
		
		if(result == true) {
			System.out.println("The given array is palindrome");
		}else {
			System.out.println("The given array is not Palindrome");
		}

	}

}
