/*
 Question:- Program to find the average of an array 
 Author:- Abhishek_Singh
 Date:-20/10/2022
 */

package CoreJava;

import java.util.Scanner;

public class AverageArray {
public static void main(String[] args) 
{
// reading the array size.
Scanner s = new Scanner(System.in);
System.out.println("Enter array size: ");
int size = s.nextInt();
// creating an array
int[] array = new int[size];
// Taking values from user 
System.out.println("Enter array values :  ");
for (int i = 0; i < size; i++) {
int value = s.nextInt();
array[i] = value;
}
// getting array length
int length = array.length;
// default sum value.
int sum = 0;
// sum of  values in array using for loop
for (int i = 0; i < array.length; i++) {
sum += array[i];
}
double average = sum / length;
System.out.println("Average of array : " + average);
}
}
