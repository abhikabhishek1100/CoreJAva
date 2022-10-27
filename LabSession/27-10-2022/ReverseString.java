/*
 Question :- Program to Reverse a string
 Author :- Abhishek_Singh
 Date:- 27/10/2022
 */
package CoreJava;
import java.util.Scanner;
class ReverseString
{
public static void main (String[] args) 
{
// Creating Scanner class to take input from the user 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the  word to Reverse :- ");
String revrs =sc.nextLine();
// Using string builder Function
StringBuilder sb = new StringBuilder(revrs);
System.out.println("The Reverse of the word is :- "+sb.reverse());
}
}
