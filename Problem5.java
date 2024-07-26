
import java.util.Scanner;
class Problem5{
	
	public	static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age= scanner.nextInt();

		if(age>18)
		{
			System.out.println("eligible for voting:");
		}else{
	
			System.out.println("Not eligible for voting:");
		}
	}
	
}