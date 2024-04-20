
import java.util.Scanner;
class Array_minDemo{

	public static void main(String args[])
	{
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		size= scanner.nextInt();
		
		int[] a = new int[size];

		System.out.println("Enter the array element:");

		
		for(int i=0;i<size;i++)
		{
			a[i]=scanner.nextInt();
		}
		int min=a[0];
		for(int i=0;i<size;i++)
		{
		  	System.out.println(i+"index:"+a[i]);
			if(min>=a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum="+min);
	}
}