/*
Program to compare two sets and retain elements 
which are same on both sets.
Author:- ABhishek_SIngh
Date:- 03/11/2022
 */
package Collection;

import java.util.HashSet;

class HashSetCheck 
{

public static void main(String[] args)
{
// Creating a empty hash set
HashSet<String> set1 = new HashSet<String>();
// Using add() method to add values
set1.add("abhishek");
set1.add("shubham");
set1.add("vinay");
set1.add("abhi");
System.out.println("Frist HashSet content: "+ set1);
HashSet<String> set2 = new HashSet<String>();
set2.add("abhi");
set2.add("Pink");
set2.add("abhishek");
set2.add("Orange");
System.out.println("Second HashSet content: " + set2);
// Applying retainall() method
set1.retainAll(set2);
System.out.println("HashSet content:");
System.out.println(set1);
}
}
