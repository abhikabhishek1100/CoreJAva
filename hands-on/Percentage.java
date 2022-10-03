/*
 Program to find out the Percentage and if the Percentage is above 60 print pass else print fail
 Author :- Abhishek_Singh
 Date :- 03/10/2022
 */
package CoreJava;
import java.util.Scanner;
class Percentage
{
public static void main(String[] args) 
{
// Creating Scanner object to take values from the user 
Scanner sc = new Scanner(System.in);
// Taking the name from the user
System.out.println("Enter you name : ");
String name =  sc.nextLine();
System.out.println("Name is: " + name);
// Taking the marks of all the subjects
System.out.println("Enter the marks to find out the percentage");
System.out.println("enter the marks of hindi :- ");
float hindi = sc.nextFloat();
System.out.println("enter the marks of english :- ");
float english = sc.nextFloat();
System.out.println("enter the marks of maths :- ");
float maths = sc.nextFloat();
System.out.println("enter the marks of science :- ");
float science = sc.nextFloat();
System.out.println("enter the marks of sst :- ");
float sst = sc.nextFloat();
float percent = (hindi+english+maths+science+sst)/5;
System.out.print("the percentage of the student is :- ");
System.out.println(percent);
// Checking the condition  for fail or pass
if(percent>60)
{
System.out.println("You are passed " + name);	
}
else 
{
System.out.println("You are failed " + name);
}
}
}

         
