package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dsa22 {


		public static void main(String[] args) {
			// subsequence of a string with duplicate elements 
			int[] arr= {1,2,2};
			List<List<Integer>> ans =subset(arr);
			for(List<Integer> list :ans) {
				
			
	System.out.println(list);
			}
		}
		static List<List<Integer>> subset(int[] arr){
			Arrays.sort(arr);
			List<List<Integer>> outer=new ArrayList<>();
			outer.add(new ArrayList<>()); //new empty list is added 
			int start=0;
			int end=0;
			for(int i=0;i<arr.length;i++) {
				start=0;
			
			//if current and previous elements same s=e+1
				
			if( i > 0 && arr[i]==arr[i-1]) {  
				start = end+1;
			}
			end=outer.size() -1;
				int n=outer.size(); 
		
				for(int j=start;j<n;j++) {
					List<Integer> internal=new ArrayList<>(outer.get(j));  //copy of the outer list
					internal.add(arr[i]); //the current number 
					outer.add(internal);
				}
			}
			
			return outer;
		}

	}
