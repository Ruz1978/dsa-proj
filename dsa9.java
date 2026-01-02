package DSA;

public class dsa9 {

	public static void main(String[] args) {
		// ARRAYS QUES
		//find if the array is sorted or not (using recursion)
int[] arr = {1,2,4,8,9,12};
System.out.println(sorted(arr,0));
	}
	static boolean sorted(int[] arr, int index) {
		//base condition 
	if(index==arr.length-1) {
		return true;
	}
	return arr[index] <arr[index+1] && sorted(arr ,index+1);
	
	}

}
