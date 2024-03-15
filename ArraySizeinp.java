
import java.util.Scanner;
class ArraySizeinp{

public static void main(String args[])
{
	Scanner scanner = new Scanner(System.in);
	int[] a;
	int size;
	System.out.println("Enter the Size of Array:");
	size = scanner.nextInt();
	a = new int[size];
	
	System.out.println("Enter the Array element:");
	for(int i=0 ; i<size ; i++)
	{
		a[i] = scanner.nextInt();
	} 

	for(int i=0 ; i<size ; i++)
	{
		System.out.println(i+":"+"ArrayIndex="+a[i]);
	}
	 
}
}