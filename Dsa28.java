package DSA;

import java.util.Arrays;

public class Dsa28 {

	public static void main(String[] args) {
		// move to all directions
		boolean[][] board = {
				{true,true,true},
				{true,true,true},
				{true,true,true}
		};
		allpath("" ,board,0,0);
		int[][] path=new int[board.length] [board[0].length];
		allpathprint("" ,board,0,0,path,1);
	}
	static void allpath(String p,boolean[][] maze,int r,int c) {
		if(r==maze.length-1  && c==maze[0].length-1) {
			System.out.println(p);
		return;
		}
		
		if(maze[r][c]==false) {  //can be written as  !maze[r][c]		
			return;
		}
		//considering this block in my path
				maze[r][c]=false;
		if(r<maze.length-1) {  //i.e the last co-ordinates
			allpath(p+'D',maze,r+1,c);
			
		}
		if(c<maze[0].length-1) {
			allpath(p+'R',maze,r,c+1);
		}
		
		if(r>0) {
			allpath(p+'U',maze,r-1,c);
		}
		if(c>0) {
			allpath(p+'L',maze,r,c-1);
		}
		
		//this line is where the fun will over 
		//so before the function gets removed,also remove the changes that were made by the functions 
		maze[r][c]=true;
		
		
	}
	//printing all path
	static void allpathprint(String p,boolean[][] maze,int r,int c,int[][] path,int step) {
		if(r==maze.length-1  && c==maze[0].length-1) {
			for(int[] arr:path) {
				path[r][c]= step;
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println();
		return;
		}
		
		if(maze[r][c]==false) {  //can be written as  !maze[r][c]		
			return;
		}
		//considering this block in my path
				maze[r][c]=false;
				
				path[r][c]= step;
		if(r<maze.length-1) {  //i.e the last co-ordinates
			allpathprint(p+'D',maze,r+1,c,path,step+1);
			
		}
		if(c<maze[0].length-1) {
			allpathprint(p+'R',maze,r,c+1,path,step+1);
		}
		
		if(r>0) {
			allpathprint(p+'U',maze,r-1,c,path,step+1);
		}
		if(c>0) {
			allpathprint(p+'L',maze,r,c-1,path,step+1);
		}
		
		//this line is where the fun will over 
		//so before the function gets removed,also remove the changes that were made by the functions 
		maze[r][c]=true;
		path[r][c]= 0;
	}
	}


