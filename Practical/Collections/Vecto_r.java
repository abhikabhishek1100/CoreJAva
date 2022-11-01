/*
The Vector in Java is a class that implements a dynamic array. This means we can increase or
decrease the size of the array dynamically.
 */
package Collection;
import java.util.Vector;
class Vecto_r
{
public static void main(String[] args) 
{
Vector<String> ob = new Vector<String>();
ob.add("Aabc");
ob.add("abd");
// Using INdex NUmber
ob.add(2,"abc");
System.out.println( "vector :" +ob );
// Using addall method
Vector<Integer> a = new Vector<Integer>();
a.add(5);
a.add(6);
System.out.println("new vector is :"+a);
//Using Remove method  to remove element
String st= ob.remove(1);
System.out.println("Removed element is : "+st);
System.out.println("new vector is : "+ob);
// Using Clear method 
ob.clear();
System.out.println("Vector after : "+ob);
}
}
