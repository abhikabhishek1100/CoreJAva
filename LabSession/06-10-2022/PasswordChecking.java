/*
 Question 3:- Program to check the condition for checking the correct password using If-Else.
 Take input from the user.
 Author:- Abhishek_Singh
 Date:-06/10/2022
 */

package CoreJava;
import java.util.Scanner;
class PasswordChecking 
{
public static void main(String[] args) 
{
// Creating Scanner object to take input from the user
Scanner sc = new Scanner(System.in);
// taking the username
System.out.println("Enter your username :");
String username =sc.nextLine();
//taking the password
System.out.println("Enter your password :");
int password = sc.nextInt();
//Applying the condition to check whether the password is correct or not
if(password==4321)
{
System.out.println("Password is correct for the username :" + username);
}
else 
{
System.out.println("Password is incorrect for the username :" + username);
}
}
}
