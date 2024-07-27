
import java.util.Scanner;
class Problem8{
	
	public static double findPower(double x,double n){

		double pow=1;
		
		for(int i=1;i<=n;i++){

			pow = pow * x;

		}

		return  pow;
	
	}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X=");
		double x = sc.nextDouble();

		System.out.println("Enter the value of N=");
		double n = sc.nextDouble();

		System.out.println("Power of x="+findPower(x,n));
		
	}
	
}