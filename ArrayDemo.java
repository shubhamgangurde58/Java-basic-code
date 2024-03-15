
import java.util.Scanner;
class ArrayDemo{
	
	public static void main(String args[]){
	
	int[] a = new int[5];

	Scanner scanner = new Scanner(System.in); 
	System.out.println("Enter the Array element:");

	for(int i=0 ; i<5 ; i++){

	 a[i]=scanner.nextInt();

	}
	for(int i=0;i<5;i++){

	System.out.println(i+"Arrayindex="+a[i]);

	}
	}
}