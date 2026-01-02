package DSA;

import java.util.Arrays;

public class dsa12 {

	public static void main(String[] args) {
		// Pattern Questions (using recursion)
		//triangle 1
triangle(4,0);

//triangle 2
triangle2(4,0);

//bubble sort
int[] arr = {5, 4, 3, 2, 1};
Bubble(arr,arr.length-1,0);
System.out.println();
System.out.println("Bubble sort: ");
System.out.println(Arrays.toString(arr));

//selection sort
System.out.println();
System.out.println("Selection Sort");
int[] arr1 = {5, 9, 7, 3, 1};
Selection(arr1,arr1.length,0,0);
System.out.println(Arrays.toString(arr1));

	}
static void triangle(int r,int c) {
	if(r==0) {
		return;
	}
	if(c<r) {
		System.out.print("*");
	triangle(r,c+1);
	}else {
		System.out.println();
		triangle(r-1,0);
	}
}
	
	//triangle 2
	static void triangle2(int r,int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			triangle2(r,c+1);
			System.out.print("*");
		}else {
			triangle2(r-1,0);
			System.out.println();
			
		}
	}
	
//BUBBLE SORT (USING RECURSION)
	static void Bubble(int[] arr,int r,int c) {
		if(r==0) {
			return;
		}
		//swap
		if(c<r) {
			if(arr[c]>arr[c+1] ){
			int temp=arr[c];
			arr[c]=arr[c+1];
			arr[c+1]=temp;
			
			
			}
			Bubble(arr,r,c+1);
			
		}else {
			Bubble(arr,r-1,0);

			
		}
	}
	
	
	//SELECTION SORT
	static void Selection(int[] arr1,int r,int c, int max) {
		if(r==0) {
			return;
		}
		if(c<r) {
			if(arr1[c]>arr1[max]) {
				Selection(arr1,r,c+1,c);
			
			}else {
				Selection(arr1,r,c+1,max);
			}
			}else {
		//we got the max so now going to Swap
				int temp=arr1[max];
				arr1[max]=arr1[r-1];
				arr1[r-1]=temp;
				Selection(arr1,r-1,0,0);
			
		}
	}
	
	
	
	
	
	
	
	
	
	
}

