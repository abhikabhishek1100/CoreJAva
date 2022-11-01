/*
 *Linked list implements the collection interface
 *and it also Stores doplicate data 
 */
package Collection;

import java.util.LinkedList;
import java.util.Iterator;

class Linked_List
{

public static void main(String[] args) 
{
		LinkedList<Integer> ab = new LinkedList<Integer>();//Creating array list
		// Adding Objects in Linkedlist
		ab.add(4);
		ab.add(5);
		ab.add(6);
		//System.out.println(ab);
		Iterator b =ab.iterator(); 
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
		}
	}
