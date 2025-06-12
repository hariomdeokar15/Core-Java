package arraybasicquestion;

import java.util.Arrays;

public class RemoveDuplicatesWithoutSet {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 1, 3, 4, 5, 6, 6, 7};

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Create a new array to store unique elements
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            // If current element is not equal to next element, store it
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Add the last element
        temp[j++] = arr[arr.length - 1];

        // Step 3: Print the result
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
