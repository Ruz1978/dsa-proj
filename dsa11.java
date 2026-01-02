package DSA;

public class dsa11 {

	public static void main(String[] args) {
		// Rotated Binary Search
int[] arr= {5,6,7,8,9,1,2,3};
System.out.println(search(arr,5,0,arr.length-1));
	}
	static int search(int[] arr, int target,int s , int e) {
		if(s>e) {
			return -1;
		}
		//element found
		int m=s+(e-s)/2; //mid 
		if(arr[m]==target) { 
	return m;
	}
	//case1  left side
	if(arr[s]<=arr[m]) {
		if(target >= arr[s] && target <= arr[m]) {
			return search(arr,target,s,m-1);
		}else {
			return search(arr,target,m+1,e); 
		}
	}
	//case2 right side
if(target>=arr[m]&& target<=arr[e]) {
	return search(arr,target,m+1,e);
}
//else case3
return search(arr,target,s,m-1);
}
}
