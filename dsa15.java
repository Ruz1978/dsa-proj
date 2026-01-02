package DSA;

public class dsa15 {

	public static void main(String[] args) {
		//In-place Merge sort 
		//time complexity in worst case O(n^2)   space complexity O(1 space) but practically not used 
		int[]arr= {5,4,3,2,1};
		inplacemergesort(arr,0,arr.length-1);
		for(int x:arr) {
			System.out.println(x+" ");
		}

	}
	public static void inplacemergesort(int[] arr,int s,int e) {
		if(s>=e) return;
		int mid=s+(e-s)/2;
		inplacemergesort(arr,s,mid);
		inplacemergesort(arr,mid+1,e); 
		
		merge(arr,s,mid,e);
	}
	//in place merge sort 
	private static void merge(int[] arr,int s,int mid,int e) {
		int i=s;
		int j=mid+1;
		while(i<=mid && j<=e) {
			if(arr[i]<=arr[j]) {
				i++;
			}else {
				int value=arr[j];  //this is x   as left arr is sorted we r putting the right arr in temp value bcz 
				//i the value at left side is greater than j the right side then the right side value has to be shfted to left nd
				//the values at i nd left has to shift towards right to make space for  j the right one only if i>j
				int index=j;
				//shift elements right
				while(index>i) {
					arr[index]=arr[index-1];
					index--;
				}
				arr[i]=value;
				i++;
				mid++;
				j++;
			}
		}
	}

}
