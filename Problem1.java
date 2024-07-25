
import java.util.Scanner;
class Problem1{

	public static void findAverage(int a,int b, int c){
	
		 int average = (a+b+c)/3;
	
		System.out.println("Average="+average);

	}

	public static void main(String args[]){

		System.out.println("--Enter 3 number from user & Make a Function to Print thire average:--");
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the Three Number to Calculate the Average:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		findAverage(a,b,c);
	}

}