
import java.util.Scanner;
class ArithmeticException {

	public static void main(String args[]){
	
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A & B");
		a=sc.nextInt();
		b=sc.nextInt();

		try{
			c=a/b;
			System.out.println("Division="+c);

		 } catch (Exception ex) 
			{
				System.out.println("Can not divide by zero");
			}
	}
}