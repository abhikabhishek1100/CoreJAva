/*
Question:- Program to find the Minimum and Maximum Value
Author :- Abhishek_Singh
Date:- 20/10/2022 
*/
package CoreJava;
import java.util.Scanner;
class MaxMin
{
public static void main(String[] args)
{  
//Creating Scanner class to take input values
Scanner sc= new Scanner(System.in);
//taking array size
System.out.println("Enter the size of array ");
int n= sc.nextInt();
System.out.println("Enter the elements ");
//declaring the array
int a[]= new int [n];
//Traversing the array
for(int i=0; i<n;i++)
{ a[i]=sc.nextInt();}
int max=a[0];int min =a[0];
//Traversing the array
for(int j=0;j<n;j++)
{
if (a[j]>max)
{
max= a[j];}
else 
{
min=a[j];
}
}
System.out.println("Maximum value of the array " + max);
System.out.println("Minimum value of the array " + min);
}
}