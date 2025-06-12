package insertionsort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1}; // Given array
        
        for (int i = 1; i < arr.length; i++) {  
            int current = arr[i]; // Store the current element
            int j = i - 1;
            
            // Shift elements of the sorted part to find correct position
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j]; // Shift larger element to the right
                j--; 
            }
            arr[j + 1] = current; // Insert the current element at the correct position
        }
        
        // Print the sorted array
        for (int k = 0; k < arr.length; k++) {  
            System.out.print(arr[k] + " ");  
        }
    }
}
