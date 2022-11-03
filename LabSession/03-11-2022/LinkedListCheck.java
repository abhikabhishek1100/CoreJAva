/*
 Program to check if a Particular Element exist in Linkedlist.
 Author :- ABhishek_Singh
 Date:-03/11/2022
 */
package Collection;

import java.util.LinkedList;

class LinkedListCheck 
{

public static void main(String[] args) 
{
// CReating List
LinkedList list = new LinkedList();
// Adding Elements In the List
list.add("3");
list.add("4");
list.add("5");
list.add("6");
// Creating boolean object
boolean listElement = list.contains("3");
if(listElement)
{
System.out.println("LinkedList contains 3");
}
else
{
System.out.println("LinkedList does not contain 3");
}
}
}
