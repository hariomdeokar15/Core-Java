package arraybasicquestion;

public class SmallerElement {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		int small = arr[0];
		
		for(int num:arr) {
			if(num<small) {
				small = num;
			}
		}
		System.out.println("The Smaller number is : "+small);

	}

}
