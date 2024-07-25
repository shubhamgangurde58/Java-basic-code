import java.util.Scanner;

class Problem2{

		public static void sumDemo(int n){

			int sum=0;
			for(int i=0;i<=n;i++){

				if(i%2!=0){

					 sum = sum+i;
					System.out.println(i);
				}
			}
			System.out.println("Sum of Odd Number="+ sum);
		}

		public static void main(String args[]){

			Scanner sc = new Scanner(System.in);
	
			System.out.println("Write a function to print the sum of all Odd number from 1 to N:\n");
			System.out.println("Enter the No :");
			int n=sc.nextInt();

			//function calling
			sumDemo(n);

	}
	
}