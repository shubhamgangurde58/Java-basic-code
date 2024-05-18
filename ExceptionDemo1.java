
import java.util.Scanner;
class ExceptionDemo1{

	public static void main(String args[]){
		
		int a;
		int b;
		int c;
	
		int[] arr={10,20,30,40};
		String name="shubham";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value of A & B:");
		a=sc.nextInt();
		b=sc.nextInt();
		

		try{
			c=a/b;
			System.out.println("Division="+c);
			System.out.println("Length="+name.length());
			for(int i=0;i<=4;i++){
				System.out.println(i+"Index"+arr[5]);
			}
		
		}catch(ArithematicException e)
		{
			System.out.println("Can not Divide by Zero:");
		
		}
		catch(NullPointerException ex1)
		{
			System.out.println("Please enter the name:");

		}catch(ArrayIndexOutOfBoundsException ex2)			
		{
			System.out.println("Array Bounds Exceeded...\nTry Again");

		}finally{

			System.out.println("code Block Done");
		}
			
	}	
}