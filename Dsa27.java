package DSA;

import java.util.ArrayList;

public class Dsa27 {

	public static void main(String[] args) {
		// maze plm returning the no of paths 
System.out.println(count(3,3));
path("",3,3);
System.out.println(diagonal("",3,3));
boolean[][] board = {
		{true,true,true},
		{true,false,true},
		{true,true,true}
};
pathrest("" ,board,0,0);
	}
	
	//returning the no 
	static int count(int r,int c) {
		if(r==1 || c==1) {
			return 1;
		}
		int left=count(r-1,c);
		int right=count(r,c-1);
		return left+right;
	}
	//printing paths
static void path(String p,int r,int c) {
	if(r==1 && c==1) {
		System.out.println(p);
	return;
	}
	if(r>1) {
		path(p+'D',r-1,c);
		
	}
	if(c>1) {
		path(p+'R',r,c-1);
	}
	}
	

//down right diagonally 
static ArrayList<String>  diagonal(String p,int r,int c) {
	if(r==1 && c==1) {
		ArrayList<String> list=new ArrayList<>();
		list.add(p);
		return list;
		
	}
	ArrayList<String> list=new ArrayList<>();
	
	if(r>1 && c>1) {
		list.addAll(diagonal(p+ 'D',r-1,c-1));
	}
	if(r>1) {
		list.addAll(diagonal(p+'V',r-1,c));
		
	}
	if(c>1) {
		list.addAll(diagonal(p+'H',r,c-1));
	}
	return list;
}
//path with obstacles 
static void pathrest(String p,boolean[][] maze,int r,int c) {
	if(r==maze.length-1  && c==maze[0].length-1) {
		System.out.println(p);
	return;
	}
	if(maze[r][c]==false) {  //can be written as  !maze[r][c]		
		return;
	}
	if(r<maze.length-1) {  //i.e the last co-ordinates
		pathrest(p+'D',maze,r+1,c);
		
	}
	if(c<maze[0].length-1) {
		pathrest(p+'R',maze,r,c+1);
	}
	}
	
}
