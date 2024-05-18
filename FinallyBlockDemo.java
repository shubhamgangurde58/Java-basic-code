
import java.util.Scanner;
class FinallyBlockDemo{

	public static void main(String args[]){
		
		int a;
		int b;
		int c;
	
		int[] arr={10,20,30,40};
		String name="shubham";

		try{
			
			System.out.println("Length="+name.length());
			for(int i=0;i<=4;i++){
				System.out.println(i+"Index"+arr[5]);
		}

		}catch(NullPointerException ex1)
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