/*
Question :- Program to Sort  array
Author:- Abhishek_Singh
Date:- 27/10/2022
*/
package CoreJava;
import java.util.Scanner;
class intsrt
{
public static void main(String[] args) 
{
//Creating Scanner class to take values
Scanner sc = new Scanner (System.in);
//Declaring array size
System.out.println("Enter the size of array");
int n = sc.nextInt();
//Taking Values
System.out.println("Enter the elements of array");
int a[]= new int[n];
//Traversing the array
for(int i=0; i<n;i++)
{
a[i]=sc.nextInt();
}
//Traversing the array
for (int i = 0; i < n; i++)   
{  
for (int j = i + 1; j < n; j++)   
{  
int tmp = 0;  
if (a[i] > a[j])   
{  
tmp = a[i];  
a[i] = a[j];  
a[j] = tmp;  
}  
} 
System.out.println("The sorted array is :"+a[i]);
}
}
}