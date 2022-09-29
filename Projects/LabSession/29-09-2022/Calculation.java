/*
 Creating a Program for calculation
 Author : Abhishek Singh
 Date : 29/09/2022
 */
package CoreJava;

import java.util.Scanner;
//Creating class
class Calculation 
{
public static void main(String[] args)
{
//Creating Scanner object to take the value from the user
 Scanner sc = new Scanner(System.in);
// taking input from the user 
System.out.print( "Enter the first number :");
int num1 = sc.nextInt();
System.out.print( "Enter the Second number :");
int num2 = sc.nextInt();
//selecting the operand for calculation
System.out.println("For addition press 1; For Subtraction press 2;For Division press 3;For Multilpication press 4");
System.out.println("press 1 for addition; press 2 for subtraction; press 3 for multiplication; press 4 for divison;");
int choice=sc.nextInt();
switch(choice) {
case 1:
System.out.println("Addition of the given two number is:"+(num1+num2));
break;
case 2:
System.out.println("subtraction of the given two number is:"+(num1-num2));
break;
case 3:
System.out.println("Division of the given two number is:"+(num1/num2));
break;	
case 4:
System.out.println("Multiplication of the given two number is:"+(num1*num2));
break;
default:
System.out.println("You pressed wrong choice ");
}
}
}

