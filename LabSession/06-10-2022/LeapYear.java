/*
 Program to find that the given year is a Leap year or not
 Author :- Abhishek_Singh
 Date:- 06/10/2022
 */

package CoreJava;
import java.util.Scanner;
class LeapYear 
{
public static void main(String[] args) 
{
// Creating Scanner object to take the values from the user 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the year to check that it is leap year or not :");
int year = sc.nextInt();

// Applying condition to check that the entered year is leap year or not 
if(year%4==0)
{
System.out.println("This is the leap year : " + year);	
}
else
{
System.out.println("This is not the leap year : " + year);
}
}
}
