package arraybasicquestion;

public class MergeTwoArray {	

	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3};
		int[] array2 = {4, 5, 6};
		int[] merge = new int[array1.length+array2.length];
		
		System.arraycopy(array1, 0, merge, 0, array1.length);
		System.arraycopy(array2, 0, merge, array1.length, array2.length);
		
		for(int num: merge) {
			System.out.print(num+" ");
		}

	}

}
