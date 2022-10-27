/*
Question:- Program to Print Happy Diwali using Loop 
Author :- Abhishk_Singh
Date:- 27-10-2022
 */
package CoreJava;
import java.util.Scanner;
public class hpydwli 
{
public static void main(String[] args) 
{
// Creating Scanner class to take values	
Scanner sc= new Scanner (System.in);
System.out.println("Enter how many times you want to print:");
int n=sc.nextInt();
int i=0; 
while(i<n)
{
System.out.println(" Wish you a very Happy Diwali ");
i++;
}
}
}