/*
 Program to find the largest number
 Author:- Abhishek Singh
 Date :- 29/09/2022
 */

package CoreJava;

import java.util.Scanner; 
class LargestNumber 
{

public static void main(String[] args) {
//Creating Scanner object for taking input from the user
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number :");
int num1 = sc.nextInt();
System.out.println("Enter the second number :");
int num2 = sc.nextInt();
//Applying the condition and checking the values
if(num1>num2) 
{
System.out.println("Greatest number is :" + num1);
}
else
{
System.out.println("Greatest number is :" + num2);	
}
}
}
