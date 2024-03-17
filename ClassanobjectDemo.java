
import java.util.Scanner;
class ClassanobjectDemo{
	
	private static int a;
	private static int b;
	private static int c;
	
	Scanner scanner = new Scanner(System.in);

	public void add(){
	   
	   System.out.println("Enter the value of A:");
	   a = scanner.nextInt();
	   System.out.println("Enter the value of B:");
	   b = scanner.nextInt();

	   c=a+b;
	   System.out.println("Addition="+c);
	}
	public static void main(String[] args){
	
	ClassanobjectDemo classanobjectDemo = new ClassanobjectDemo();
	classanobjectDemo.add();

	}
}