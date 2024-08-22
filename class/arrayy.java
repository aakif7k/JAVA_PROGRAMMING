import java.util.Scanner;
public class arrayy   
{  
public static void main(String[] args)   
{  
int n;  
Scanner myobj=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
n=myobj.nextInt();  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
array[i]=myobj5.nextInt();  
}  
System.out.println("Array elements are: ");  
for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
}  
}  
}  