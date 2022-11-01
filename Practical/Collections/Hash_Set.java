/*
 * The elements are stored by using hashing.
 * contains unique element.
 * Allows null value.
 * order is in Ascending.
 */
package Collection;

import java.util.HashSet;
import java.util.Iterator;

class Hash_Set {

	public static void main(String[] args)
	{
		HashSet<String> name=new HashSet<>();
		name.add("Sachin");
		name.add("Raja");
		name.add("Aditya");
		name.add("Mahima");
		name.add("Aditya");
		//Traversing elements(iterator)
		Iterator<String> itr=name.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}