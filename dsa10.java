package DSA;

import java.util.ArrayList;
import java.util.List;

public class dsa10 {

	public static void main(String[] args) {
		// linear search using recursion 
		int[] arr= {2,3,1,4,4,5};
		System.out.println( find(arr,4,0));
		System.out.println( findIndex(arr,4,0));
		System.out.println( findIndexlast(arr,4,arr.length-1));
		findallIndexlast(arr,4,0);
		System.out.println(list);
		System.out.println(find1(arr,4,0,new ArrayList<>()));
		System.out.println(find2(arr,4,0));
	}
	//returns true or false 
	static boolean find(int [] arr,int target,int index) {
		if(index==arr.length) {
			return false;
		}
		return arr[index]==target || find(arr,target,index+1);
	}
	//gives index value 
	static int findIndex(int[] arr,int target,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}else {
		return findIndex(arr,target,index+1);
	}
	}	
	//if searching frm the last
	static int findIndexlast(int[] arr,int target,int index) {
		if(index==-1) {    //index is eq to the last index 
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}else {
		return findIndexlast(arr,target,index-1);  // index-1 
	}
		
		
		
	}	
	
	//using array list nd getting all index
		static ArrayList<Integer> list=new ArrayList<>();
	static void findallIndexlast(int[] arr,int target,int index) {
		if(index==-1) {   
			return ;
		}
		if(arr[index]==target) {
			list.add(index);
		}else {
		 findallIndexlast(arr,target,index+1);
	}
		
		
		
	}	
			
	//In recursion the return type has to be an array list 	
		static ArrayList<Integer> find1(int[] arr,int target,int index, ArrayList<Integer> list){
			if(index==arr.length) {
				return list;
			}
			if(arr[index]==target) {
				list.add(index);
			}
			return find1(arr,target,index+1,list);
		}
		
		//but in each call a new array list will be created 
		
		static ArrayList<Integer> find2(int[] arr,int target,int index){
			ArrayList<Integer> list=new ArrayList<> ();
			if(index==arr.length) {
				return list;
			}
			//this will contain answer for that function call only
			if(arr[index]==target) {
				list.add(index);
			}
			ArrayList<Integer> ansFromBelowCalls= find2(arr,target,index+1);
			list.addAll(ansFromBelowCalls);
			return list;
		}
		
		
		
		
		
		
	
	
	
	

}
