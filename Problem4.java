import java.util.Scanner;		
class Problem4{

	public static double funDemo(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle = ");
		int radius = sc.nextInt(); 

		double pi = 3.14;

		double n = 2*pi*radius;

		return n;
		
	}

	public static void main(String args[]){

		System.out.println("circumference of circle ="+ funDemo());
	}
}