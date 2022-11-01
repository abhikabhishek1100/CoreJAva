/*
 * It is  a way to apply resizable-array 
 * in addition to the implementation of the Deque interface.
 */
package Collection;

import java.util.*;

class Array_Dequeue {
	public static void main(String[] args)
	{
		Deque<String> deque=new ArrayDeque<>();
		deque.add("mango");
		deque.add("apple");
		deque.add("banana");
		System.out.println("Elements:");
		for(String s:deque)
		{
			System.out.println(s);
		}
		//deque.pollLast():Returns last element from the deque
		deque.pollLast();
		System.out.println("After PollLast():");
		for(String s:deque)
		{
			System.out.println(s);
		}
	}

}