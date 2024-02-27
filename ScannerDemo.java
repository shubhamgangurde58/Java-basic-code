
import java.util.Scanner;
class ScannerDemo
{
	public static void main(String args[])
	{
		int a;
		int b;
		int Add;
		int Sub;
		int Multi;
		int Divi;
		Scanner scanner = new Scanner(System.in);

		a = scanner.nextInt();

		b =scanner.nextInt();

		Add = a + b;
		Sub = a - b;
		Multi = a * b;
		Divi = a / b;
		System.out.println("Addition="+Add);
		System.out.println("Subtraction="+Sub); 
		System.out.println("Multiplication="+Multi); 
		System.out.println("Divition="+Divi);  
	}
}