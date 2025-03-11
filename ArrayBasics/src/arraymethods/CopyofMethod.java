package arraymethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CopyofMethod {

	public static void main(String[] args) {
		
		//how to create array
				int[] arr = new int[4];
				
				//how to initialize array
				arr[0] = 10;
				arr[1] = 20;
				arr[2] = 30;
				arr[3] = 40;
				
				
				//How to create, Initialize and assign array in single line
				int[] arr2 = {1, 2, 3, 4};
				
				//copyoff method
				
				int[] arr3 = Arrays.copyOf(arr, 5);
				
				System.out.println("Copy of arr: "+Arrays.toString(arr3));
				
				//Sort method
				Arrays.sort(arr3);
				System.out.println("Sorted Array : "+Arrays.toString(arr3));
				
				//how to store Sorted array in any new array
				  //we can use clone() method, we need to make a clone of original array fist
				
				int [] newarray = arr3.clone();
				Arrays.sort(newarray);
				
				System.out.println("newarray : "+Arrays.toString(newarray));
				
				//Search Method
				
				//It returns the index of element
				System.out.println("Search Element :"+Arrays.binarySearch(arr3, 5));/*it showing out put as -1 if the code dose not contain element 5,
																						but in this case as 5 is related to array [0, 10, 20, 30, 40] so 
																						it will look for insertion point where the 5 element can feet between 0 and 10
																						so it will return (insertion point)-1 = -2 as output */
				
				// Deep to String 
				
				 //it is use to print two dimension 
				 int[] [] arr5 = {{2,3}, {4, 5}};
				 
				 System.out.println(Arrays.deepToString(arr5));
				 
				 //Copy of range property
				 
				 int[] arrcopyofrange = Arrays.copyOfRange(newarray, 1, 4);
				 System.out.println("Copy of range :"+Arrays.toString(arrcopyofrange));

				 //fill property
				 Arrays.fill(arr, 4);
				 System.out.println("Copy of arr: "+Arrays.toString(arr));//fills the element of array with single value
				 
				 //Arrays.stream method 
				 
				  //convert array to the stream which helps in performing functional type operations
				 int sum = Arrays.stream(arr3).sum();
				 System.out.println("Sum of array elements : "+sum);
				 
				 
				 //Arrays.setAll 
				  //set all the elements of array using generator function this method can be use to set the value based on index
				 
				 int[] array1 = new int[11];
				 
				 Arrays.setAll(array1, i -> i* 2);
				 
				 System.out.println("new array : "+Arrays.toString(array1));
				  
				 //Parallel sort 
				 
				 int[] duplicatevaluearr = {1, 2, 3, 3, 4, 5, 6, 4, 5, 4};
				 
				 Arrays.parallelSort(duplicatevaluearr);
				 
				 System.out.println("duplicate value: "+Arrays.toString(duplicatevaluearr));
				 
				 //asList 
				   //Its converts the array to list its particularly use when we need to store or convert to list 
				 
				 String[] abc = {"a", "b", "c", "d"};
				 
				 List<String> listabc = Arrays.asList(abc);
				 System.out.println(listabc);
				 
				 List<Integer> integerArray = Arrays.stream(array1).boxed().collect(Collectors.toList());
				 System.out.println(integerArray);
				 
				  	

	}

}
