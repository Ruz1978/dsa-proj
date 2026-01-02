package DSA;

import java.util.Arrays;

public class dsa13 {

	public static void main(String[] args) {
		//MERGE SORT
		int[] arr= {5,4,3,2,1};
		arr=mergeSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static int[] mergeSort(int[] arr) {   //we have to return array therefore data-type is an array 
		if(arr.length==1) {
			return arr;
		}
		int mid=arr.length/2;
		int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));        //copies the specified range in new array
		int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
		return merge(left,right);
	}
	private static int[] merge(int[] first,int[] sec) {
		int[] mix =new int[first.length + sec.length] ;
			int i=0;
			int j=0;
			int k=0;
			
			while(i<first.length && j<sec.length) {
				if(first[i]<sec[j]) {
					mix[k]=first[i];    //for the remaining elements if one array is done
					i++;
				}else {
					mix[k]=sec[j];
					j++;
				}
				k++;
			}
			
			//it may be possible that one of the arrays is not complete
			//copy the remaining elements 
			while(i<first.length) {
				mix[k]=first[i];
				i++;
				k++;
			}
			while(j<sec.length) {
				mix[k]=sec[j];
				j++;
				k++;
			}
			return mix;
			
		}
	}


