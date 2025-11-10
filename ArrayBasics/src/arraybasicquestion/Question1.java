package arraybasicquestion;


//Write a Java program to find the largest element in an array.
public class Question1 {
	
	public static void main (String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int max = 0;
		
		for(int num:arr) {
			if(num > max) {
				max=num;
			}
		}
		System.out.println("The largest number is :"+max);
	}

}
