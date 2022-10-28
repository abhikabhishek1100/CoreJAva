package CoreJava;
import java.util.Scanner;
class Divide2array 
{
public static void main(String[] args)
{
int a,b,c,d;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number of Rows ");
a = sc.nextInt();
System.out.println("Enter the number of column");
b = sc.nextInt();
int arr[][] = new int[a][b];
int arr2[][]= new int[a][b];
double result1[][]= new double[a][b];
System.out.println("Enter the elements of 1st matrix :");
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
arr[i][j] = sc.nextInt();
System.out.println();
}
}
System.out.println("enter the element of 2nd matrix");
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
arr2[i][j]=sc.nextInt();
System.out.println();
}
}
System.out.println("division of two matrix");
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
result1[i][j] = (arr[i][j])/ (arr2[i][j]);
}
}
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
System.out.print(result1[i][j]+" ");
}
System.out.println();
}
}
}