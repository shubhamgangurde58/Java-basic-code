
import java.util.Scanner;

class FactorialNo{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any no :");
		int num = sc.nextInt();
		int fact = 1;

		for(int i=num;i>0 ;i--){
			fact = fact * i;			
		}
		
		System.out.println("The Factorial of "+num+" = "+fact);	
	}

}