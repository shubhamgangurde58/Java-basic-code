
import java.util.Scanner;
class Problem10{

	public static void main(String args[]){

		int n , a=0,b=1 ,fibo = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print fibonacci series :");
		n = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);

		for(int i=1;i<=n;i++){

			fibo = a+b;
			
			a = b;
	
			b = fibo;

			System.out.println(fibo);
		}
		
	}
}