/*
Program to check  that the person is allowed for voting or not 
Author :- ABhishek_Singh
Date :- 03/10/2022 
 */
package CoreJava;
import java.util.Scanner;
class Voting 
{
public static void main(String[] args)
{
// Creating scanner object to take values from the user
Scanner sc = new Scanner(System.in);
// Taking values from the user
System.out.println("Enter your age :");
int age = sc.nextInt();
//Checking the condition
if (age>=18)
{
System.out.println("--You are allowed to vote--");
}
else
{
System.out.println("--You are not allowed to vote-- ");
}
}
}
