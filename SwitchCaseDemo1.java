
import java.util.Scanner;
class SwitchCaseDemo1{

	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Day of Week(1 To 7):");
		int day = scanner.nextInt();

		switch(day){

			case 1:
				System.out.println("Today is Monday:");
				break;
			case 2:
				System.out.println("Today is Tuesday:");
				break;
			case 3:
				System.out.println("Today is Wednesday:");
				break;
			case 4:
				System.out.println("Today is Thursday:");
				break;
			case 5:
				System.out.println("Today is Friday:");
				break;
			case 6:
				System.out.println("Today is Saturday:");
				break;
			case 7:
				System.out.println("Today is Sunday:");
				break;
			default:
				System.out.println("Invalide No ");
		}
	}
}