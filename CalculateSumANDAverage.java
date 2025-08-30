
import java.util.Scanner;

class CalculateSumANDAverage{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how many Number :");
		int num = sc.nextInt();
		int sum = 0;
		int average = 0;

		for(int i=1;i<=num;i++){
			
			System.out.println("Please Enter the number :");
			sum += sc.nextInt();
		}

		average = sum / num;
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+average);
	}
}


