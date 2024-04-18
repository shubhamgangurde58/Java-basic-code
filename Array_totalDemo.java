
import java.util.Scanner;
class Array_totalDemo{

	public static void main(String args[])
	{
		int a[];
		int size;
		int total=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		size= scanner.nextInt();
		
		a = new int[size];

		System.out.println("Enter the array element:");

		
		for(int i=0;i<size;i++)
		{
			a[i]=scanner.nextInt();
		}

		for(int i=0;i<size;i++)
		{
		  	System.out.println(i+"index:"+a[i]);
			
;			total+=a[i];
		}
		System.out.println("Total="+total);
	}
}