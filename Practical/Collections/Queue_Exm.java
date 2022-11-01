package Collection;

import java.util.LinkedList;
import java.util.Queue;

class Queue_Exm 
{
public static void main(String[] args)
{
Queue<Integer> ob= new LinkedList<Integer>();
// add() - insert the element into the queue
// offer()-insert the element into the queue
ob.add(2);
ob.offer(3);
System.out.println("Queue :- " +ob );
// Element() - returns the head element of the queue and through
// exception if the queue is empty().
// peek() -returns the head element of the queue and returns null
// if the queue is empty().
// creating a variable of data type
int a = ob.peek();
System.out.println("access element : "+ a);
// remove() - remove the head of the queue and through
// the exception if the queue is empty 
// poll() -returns the head element of the queue and return null
// if the queue is empty().
int b = ob.poll();
System.out.println("Removed elements  :-" +b);
System.out.println("updated Queue :- "+ ob);
}
}
