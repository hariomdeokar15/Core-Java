package arrayquestionandans;

public class Question1 {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		int max = arr[0];
		int min = arr[1];
		
		for(int num : arr) {
			if(num>max) {
				max = num;
				
			}
			if(num<min) {
				min = num;
			}
		}
		System.out.println("The min number is : "+min);
		System.out.println("The max number is : "+max);
	}

}
