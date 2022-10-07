/*
 Program to Print the Reverse of the number using the do while loop
 Author :- ABhishek_Singh
 Date:- 07/10/2022
 */
package CoreJava;
import java.util.Scanner;
class ReverseDoWhile {

public static void main(String[] args)
{
int num,remainder,reverse=0;
// Creating Scanner Object to take the values from the user
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Numbers :");
num = sc.nextInt();
//Applying Condition to reverse the number
do
{
//this condition will reverse the number
remainder=num%10;
reverse=reverse*10+remainder;
num/=10;
}while(num!=0);
System.out.println("Reversed Number is :" +reverse);
}
}
