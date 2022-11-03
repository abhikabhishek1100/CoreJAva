/*
Program to Replace the second element of a ArrayList 
with the specified element
Author:- Abhishek_SIngh
Date:- 03/11/2022
 */
package Collection;

import java.util.ArrayList;

class ReplaceArray
{
public static void main(String[] args)
{
// Creating array  
ArrayList<String>  name = new ArrayList<String>();
// Adding Elements in the array
name.add("Abhishek");
name.add("Shubham");
name.add("Adarsh");
System.out.println("Original array list: " + name);
// Giving new element to replace 
String new_name = "Vinay";
name.set(1,new_name);
int num=name.size();
System.out.println("Replace second element with 'Vinay'."); 
for(int i=0;i<num;i++)
System.out.println(name.get(i));
}
}
