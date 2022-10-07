/*
 Program to Print the Multiplication Table
 Author :- ABhishek_Singh
 Date:- 07/10/2022
 */
package CoreJava;
import java.util.Scanner;
class Table
{
public static void main(String[] args) 
{
// Creating Scanner class to take the values from the user
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int n = sc.nextInt();
//Condition will execute until it becomes false
for(int i=1;i<=10;i++)
{
System.out.println(n+" * "+i+" = "+n*i);
}
}
}