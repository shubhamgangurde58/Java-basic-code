
import java.util.Scanner;
class Problem7{

	public static void main(String args[]){

		int positive = 0;
		int negative = 0;
		int zero = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to continue Or 0 to Stop:");
		int input = sc.nextInt();

		do{

			System.out.println("Enter the No:");
			int number = sc.nextInt();

			if(number > 0)
			{
				positive++;

			}else if(number < 0)
			{
				negative++;
	
			}else{
					
				zero++;
			}

			System.out.println("Press 1 to continue Or 0 to Stop:");
			input = sc.nextInt();
		
		}while(input == 1);

		System.out.println("Positive = "+ positive);
		System.out.println("Negative = "+ negative);
		System.out.println("Zero = "+ zero);
		
	}
}