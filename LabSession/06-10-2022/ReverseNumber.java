/*
 Question 4:- Program to Print the reverse of a number
 Author :- Abhishek_Singh
 Date:- 06/10/2022
 */
package CoreJava;
import java.util.Scanner;
class ReverseNumber
{
public static void main(String[] args) 
{
int num,remainder,reverse=0;
// Creating Scanner object to take values from the user
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number : ");
num = sc.nextInt();
//Applying the condition to reverse the given number
while(num > 0)
{
remainder = num %10;
reverse = reverse * 10 + remainder;
num = num /10;
}
System.out.println("The reverse of the given number is: " + reverse);  
}
}
