package DSA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
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

		
		//Queue (interface - whose obj cannot be created)
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(41);
		queue.add(1);
		queue.offer(50);
		queue.offer(50);
		queue.offer(99);
		queue.offer(5);
		//both r used to add nd the adding is in ordered manner 
		System.out.println("queue "+ queue);
		System.out.println("q remove "+ queue.remove());
		System.out.println(queue);
		System.out.println("q poll "+ queue.poll());
		System.out.println(queue);
			//both removes frm st 
		System.out.println("q peek "+queue.peek());
		//ordered & duplicates r allowed 
		
		//ArrayDeque 
		Deque<Integer> adq= new ArrayDeque<Integer>();
		adq.offer(23);
		adq.offer(12);
		adq.offerFirst(13); 
		adq.offerLast(3);
		System.out.println("deque "+adq);
		//adds in ordered manner 
		System.out.println("Removed (remove): " + adq.remove()); // Removes 10
        System.out.println("Queue after remove: " + adq); 
        // Output: [20, 15, 50]

        System.out.println("Polled (poll): " + adq.poll()); // Removes 20
        System.out.println("Queue after poll: " + adq);
        // Output: [15, 50]

        // Inspecting the first element (without removing)
        System.out.println("Top element (peek): " + adq.peek()); 
        // Output: 15
		
		
    
        
        
        //dequeue
        // Deque is an interface, ArrayDeque is a common implementation
        
        Deque<Integer> dq = new ArrayDeque<>();
 
        // Adding to the rear (end)
        dq.offer(10);      // Equivalent to offerLast()
        dq.offerLast(20);
        dq.offerLast(30);

        // Adding to the front
        dq.offerFirst(40); // Adds 40 to the very beginning

        System.out.println("Deque: " + dq); 
        // Output: [40, 10, 20, 30]

        // Removing from the front
        System.out.println("Polled First: " + dq.pollFirst()); // Removes 40

        // Removing from the rear (end)
        System.out.println("Polled Last: " + dq.pollLast());   // Removes 30

        System.out.println("Final Deque: " + dq); 
        // Output: [10, 20]
		
		
     
        
        //priority queue
        // 1. Default PriorityQueue: MIN HEAP
        // Smallest element has the highest priority (comes to the top)
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        minPq.add(12);
        minPq.add(3);
        minPq.add(4);
        minPq.add(1);

        System.out.println("Min Heap (Top Element): " + minPq.peek()); 
        // Output: 1

        // 2. MAX HEAP: Using Comparator.reverseOrder()
        // Largest element has the highest priority (comes to the top)
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
        maxPq.add(12);
        maxPq.add(3);
        maxPq.add(4);
        maxPq.add(1);

        System.out.println("Max Heap (Top Element): " + maxPq.peek()); 
        // Output: 12
		
		
		//hash map & tree map
     // 1. HashMap: UNORDERED (Order is not guaranteed)
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Second", "Two");
        hashMap.put("First", "One");
        hashMap.put("Third", "Three");

        System.out.println("HashMap Output: " + hashMap);
        // Output order may vary, e.g., {Second=Two, Third=Three, First=One}
        
        System.out.println("-".repeat(20));

        // 2. TreeMap: SORTED by Key
        // Keys are sorted based on their natural order (e.g., alphabetically for Strings)
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Second", "Two");
        treeMap.put("First", "One");
        treeMap.put("Third", "Three");

        System.out.println("TreeMap Output: " + treeMap); 
        // Output: {First=One, Second=Two, Third=Three} (Keys are sorted)
        
        // Retrieving data
        System.out.println("Value for 'Second': " + treeMap.get("Second"));
        System.out.println("All Keys: " + treeMap.keySet());
        System.out.println("All Values: " + treeMap.values());
		
		
		
        
        
        
        //utility class which uses - arrays and collections 
     // 1. Arrays Class (For arrays - primitive and object)
        int[] arr = { 40, 1, 6, 2, 7, 3, 50 };
        System.out.println("Array Before Sort: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Array After Sort: " + Arrays.toString(arr));
        // Output: [1, 2, 3, 6, 7, 40, 50]
        
        // Binary Search (only works on a sorted array!)
        int index = Arrays.binarySearch(arr, 40);
        System.out.println("Index of 40: " + index); // Will return a positive index

        System.out.println("-".repeat(20));
        
        // 2. Collections Class (For List/Set/Queue implementations)
        List<String> list1 = new ArrayList<>();
        list1.add("Third");
        list1.add("First");
        list1.add("Second");
        System.out.println("List Before Sort: " + list1);

        Collections.sort(list1); 
        System.out.println("List After Sort: " + list1);
        // Output: [First, Second, Third]
        
        // Other utilities, like finding the maximum element
        System.out.println("Maximum element: " + Collections.max(list1)); // Output: Third
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
