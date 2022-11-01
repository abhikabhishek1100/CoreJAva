/*The Collection in Java is a framework that provides 
 * an architecture to store and manipulate the group of objects.
 *ArrayList:- the array list implements list interface and it uses
 * the dynamic array to store the duplicate elements of different datatypes.
 */

package Collection;

import java.util.*;

class Array_List
{

public static void main(String[] args)
{
ArrayList<Integer> ab = new ArrayList<Integer>();//Creating array list
// Adding Objects in arraylist
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
