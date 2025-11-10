package selectionsort;

public class SelectionSort {
	
	public void SortMethod(int[] arr) {
		
		for(int i = 0; i<arr.length-1; i++) {
			int smallest = i;
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[j]<arr[smallest]) {
					smallest = j;
				}
			
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
			
		}
		System.out.println("\nSorted array :");
		for(int k =0; k<arr.length; k++ ) {
			System.out.print(arr[k]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {4, 2, 3, 1};	
		System.out.println("original array :");
		for(int k =0; k<arr.length; k++ ) {
			System.out.print(arr[k]+" ");
		}
		SelectionSort s = new SelectionSort();
		s.SortMethod(arr);
		
		}
}
