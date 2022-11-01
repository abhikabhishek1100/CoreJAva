/*
 It is a type of Queue where in all the elements are ordered as per their 
 ordering and each element is associated with a Priority.
 */
package Collection;

import java.util.*;

class Priority_Queue {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> numbers=new PriorityQueue<>();
		numbers.add(710);
		numbers.add(200);
		numbers.add(100);
		numbers.add(500);
		System.out.println("Priority Queue:");
		//iterator() method : traverse
		//hasNext() :boolean(True/False) 1:true,2:true,false
		//next(): iterator
		//Iterator<Integer> iterate=numbers.iterator();
		while(!numbers.isEmpty())
		{
		  System.out.println(numbers.remove()); //Dequeue
		}

	}

}
