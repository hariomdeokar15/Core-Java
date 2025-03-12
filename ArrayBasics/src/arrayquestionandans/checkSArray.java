package arrayquestionandans;

public class checkSArray {
	
	public boolean isSrted(int[] arr) {
		int[] newarray = new int[arr.length-1];
		
	   for(int i = 0; i<arr.length -1; i++) {
		   if(arr[i]> arr[i+1]) {
			   return false;
		   }
		   
	   }
		
		
		return true;
	}

	public static void main(String[] args) {
		
		int[] arr = {2,3,4,1,6};
		
		
		checkSArray check = new checkSArray();
		System.out.println(check.isSrted(arr));;

	}

}
