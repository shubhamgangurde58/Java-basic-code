
import java.util.Scanner;
class Conditions{
	
	public	static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the No:");
		int n= scanner.nextInt();

		if(n%2==0)
		{
			System.out.println("No is Even");
		}else{
	
			System.out.println("No is Odd");
		}
	}
	
}