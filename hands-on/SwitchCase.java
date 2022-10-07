/*
 Program to demonstrate switch case 
 Author:- Abhishek_Singh
 Date:- 07/10/2022
 */
package CoreJava;
import java.util.Scanner;
class SwitchCase 
{
public static void main(String[] args)
{
//Creating Scanner object to take input from the user
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Roll no :");
int Rno = sc.nextInt();
switch (Rno) {
case 4321:
System.out.println("Your Roll no exists in Database :"+4321);
break;
case 4567:
System.out.println("Your Roll no exists in Database :"+4567);
break;
case 6789:
System.out.println("Your Roll no exists in Database :"+6789);
break;
// this is a default Statement
default:
System.out.println("Your Roll no does'nt exists in Database" );
}
}
}
