package arrayquestionandans;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = {1, 2,3,4,5,6,4,9};
		int large = 0, secondlarge = 0;
		
		
		for(int i =0; i<arr.length; i++) {
			if (arr[i]>large) {
				large = arr[i];
			}
			
		}for(int i =0; i<arr.length; i++) {
			if (arr[i]>secondlarge && arr[i]<large) {
				secondlarge = arr[i];
			}
			
		}
		
		System.out.println(large);
		System.out.println(secondlarge);

	}

}
