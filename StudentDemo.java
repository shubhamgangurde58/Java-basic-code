
import java.util.Scanner;
class StudentDemo
{
		Scanner scanner = new Scanner(System.in);
		int rollno;
		String name;
		Double fees;

		public void inputfun()
		{	
			System.out.println("Enter the rollno:");
			rollno = scanner.nextInt();

			System.out.println("Enter the name:");
			name = scanner.next();
		
			System.out.println("Enter the Fees:");
			fees = scanner.nextDouble();
	
		}
		public void outputfun()
		{
			System.out.println("rollno:"+rollno);
			System.out.println("name:"+name);
			System.out.println("fees:"+fees);
		}

	public static void main(String args[])
	{
		StudentDemo studentdemo = new StudentDemo();
		studentdemo.inputfun();
		studentdemo.outputfun();
	}
}