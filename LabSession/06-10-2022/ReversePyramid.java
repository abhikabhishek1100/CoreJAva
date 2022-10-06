/*
 Question 2:- Program to print ReversePyramid
 Author :- Abhishek_Singh
 Date:- 06/10/2022
 */

package CoreJava;
import java.util.Scanner;
class ReversePyramid 
{
public static void main(String[] args) {
//Creating Scanner Object to take the values from the user
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int n = sc.nextInt();
int i,j;
// Applying condition for printing the pattern
//First loop for the number of rows
for(i = n; i >= 1; i--)
{
//Inner loop for spacing
for(j = i; j < n; j++)
{
System.out.print(" ");
}
//loop to print star
for(j = 1; j <= (2 * i - 1); j++)
{
System.out.print("*");
}
// Providing Ending line after each row
System.out.println("");
} 
}
}
