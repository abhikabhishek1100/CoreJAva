package Collection;

import java.util.Stack;

class StackExample 
{

public static void main(String[] args)
{
Stack<Integer> ob = new Stack<Integer>();
ob.push(3);
ob.push(5);
ob.push(7);
System.out.println("the elements are :-  " +ob);
ob.pop();
System.out.println("STack after pop :-" + ob);
}

}
