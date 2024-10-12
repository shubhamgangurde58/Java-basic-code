
import java.util.Scanner;
class ArrayDemo1{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the array element ");

		for(int i=0;i<array.length;i++){
		
			array[i]=sc.nextInt();

		}

		System.out.println("Array element display :");
		for(int i=0;i<array.length;i++){

			System.out.println(array[i]);
		}

	}
}