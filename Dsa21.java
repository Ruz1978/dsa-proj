package DSA;

import java.util.List;
import java.util.ArrayList;

public class Dsa21 {

	public static void main(String[] args) {
		// Iterative program to print subsequence 
		int[] arr= {1,2,3};
		List<List<Integer>> ans =subset(arr);
		for(List<Integer> list :ans) {
			
		
System.out.println(list);
		}
	}
	static List<List<Integer>> subset(int[] arr){
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>()); //new empty list is added 
		for(int num : arr) {   //for every number in my array
			int n=outer.size(); 
	//we will take size of the outer list then add that many elements in the outer list which is stored in the empty list
			for(int i=0;i<n;i++) {
				List<Integer> internal=new ArrayList<>(outer.get(i));  //copy of the outer list
				internal.add(num); //the current number 
				outer.add(internal);
			}
		}
		
		return outer;
	}

}


//What It Does
/*int num: Declares a loop variable num of type int. 
This variable holds the value of each element in the array/collection during iteration.
You can use any valid variable name and type that matches the array's element type (e.g., String str : stringArray for a string array).
':' The colon separates the loop variable from the iterable (the array or collection).
'arr:' This must be an array or an 'Iterable' collection (like ArrayList, List, etc.) containing elements compatible with int.
For each iteration, num takes the value of the next element in arr.*/
//Key Points and Examples
/*Iteration Behavior: The loop automatically iterates over all elements of arr without needing an index. 
You can't modify the array elements directly through num (it's a copy), but you can use num in the loop body.*/