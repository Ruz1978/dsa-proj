package DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class dsa1 {

	public static void main(String[] args) {
		
		
		
		//JAVA COLLECTION FRAMEWORK
		
		//list
		List <Integer>list = new ArrayList<>() ;
		list.add(50);
		list.add(9);
		list.add(20);
		list.add(91);
		list.add(91);
		list.add(1,23);
		System.out.println(list);
		//same elements r possible & unordered
		
	//linkedList
		List <Integer>linkedList =new LinkedList<Integer>();
		linkedList.add(0,91);
	 	linkedList.add(33);
		linkedList.add(2,46);
		linkedList.add(2,46);
		System.out.println(linkedList);
		//same elements r possible & ordered
		
		//vector
		Vector<String> vector = new Vector<String>();
		vector.add("you");
		vector.add("3");
		vector.add("1he");
		vector.add("one");
		vector.add("one");
		System.out.println("Vector = "+ vector);
		//duplicates r possible & ordered
		
		//stack
		Stack<Integer> stack=  new Stack<Integer>();
		stack.push(99);
		stack.push(23);
		stack.push(25);
		stack.push(25);
		stack.push(51);
		stack.pop();
		System.out.println(stack.peek());
		System.out.println("Stack = "+ stack);
		//duplicates r possible & ordered
		
		//HashSet
		Set<Integer> set =new HashSet<Integer>();
		set.add(34);
		set.add(9);
		set.add(3);
		set.add(3);
		set.add(60);
		System.out.println("HashSet = "+ set);
		//no duplicates stored & unordered *******
	
		//LinkedHashSet
		LinkedList <Integer> llset=new LinkedList<Integer>();
		llset.add(42);		
		llset.add(2);		
		llset.add(100);		
		llset.add(100);		
		llset.add(42);		
		boolean b1= llset.contains(3);
		
		System.out.println("linkedlistset = "+llset);
		System.out.println("3 is present or not: "+ b1 + "linkedhashset");
		//duplicates can be added & ordered
		
		//TreeSet
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(21);		
		tset.add(11);		
		tset.add(9);		
		tset.add(21);	
		System.out.println("treeset = "+ tset);
		//unordered nd no duplicates r stored & unordered *****

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
